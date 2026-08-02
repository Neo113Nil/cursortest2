package androidx.glance.appwidget.action;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.os.StrictMode;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1;
import androidx.core.os.BundleKt;
import androidx.glance.action.Action;
import androidx.glance.action.ActionParameters$Key;
import androidx.glance.action.LambdaAction;
import androidx.glance.action.MutableActionParameters;
import androidx.glance.appwidget.TranslationContext;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class ToggleableKt {
    public static final ActionParameters$Key ToggleableStateKey = new ActionParameters$Key("android.widget.extra.CHECKED");

    public static final Uri createUniqueUri(TranslationContext translationContext, int i, int i2, String str) {
        String str2;
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("glance-action");
        if (i2 == 1) {
            str2 = "ACTIVITY";
        } else if (i2 == 2) {
            str2 = "BROADCAST";
        } else if (i2 == 3) {
            str2 = "SERVICE";
        } else if (i2 == 4) {
            str2 = "FOREGROUND_SERVICE";
        } else {
            if (i2 != 5) {
                throw null;
            }
            str2 = "CALLBACK";
        }
        builder.path(str2);
        builder.appendQueryParameter("appWidgetId", String.valueOf(translationContext.appWidgetId));
        builder.appendQueryParameter("viewId", String.valueOf(i));
        builder.appendQueryParameter("viewSize", DpSize.m1045toStringimpl(translationContext.layoutSize));
        builder.appendQueryParameter("extraData", str);
        if (translationContext.isLazyCollectionDescendant) {
            builder.appendQueryParameter("lazyCollection", String.valueOf(translationContext.layoutCollectionViewId));
            builder.appendQueryParameter("lazeViewItem", String.valueOf(-1));
        }
        return builder.build();
    }

    public static final Intent getFillInIntentForAction(Action action, TranslationContext translationContext, int i, Function1 function1) {
        if (action instanceof StartActivityIntentAction) {
            StartActivityIntentAction startActivityIntentAction = (StartActivityIntentAction) action;
            Intent startActivityIntent = getStartActivityIntent(startActivityIntentAction, (MutableActionParameters) function1.invoke(startActivityIntentAction.parameters));
            if (startActivityIntent.getData() == null) {
                startActivityIntent.setData(createUniqueUri(translationContext, i, 5, ""));
            }
            return startActivityIntent;
        }
        if (!(action instanceof LambdaAction)) {
            Path$$ExternalSyntheticBUOutline0.m$1(action, "Cannot create fill-in Intent for action type: ");
            return null;
        }
        ComponentName componentName = translationContext.actionBroadcastReceiver;
        if (componentName == null) {
            a$$ExternalSyntheticBUOutline0.m$3("In order to use LambdaAction, actionBroadcastReceiver must be provided");
            return null;
        }
        Intent putExtra = new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", translationContext.appWidgetId);
        Intent intent = new Intent(translationContext.context, (Class<?>) InvisibleActionTrampolineActivity.class);
        intent.setData(createUniqueUri(translationContext, i, 2, ""));
        intent.putExtra("ACTION_TYPE", "BROADCAST");
        intent.putExtra("ACTION_INTENT", putExtra);
        return intent;
    }

    public static final PendingIntent getPendingIntentForAction(Action action, TranslationContext translationContext, int i, Function1 function1) {
        Context context = translationContext.context;
        if (action instanceof StartActivityIntentAction) {
            StartActivityIntentAction startActivityIntentAction = (StartActivityIntentAction) action;
            Intent startActivityIntent = getStartActivityIntent(startActivityIntentAction, (MutableActionParameters) function1.invoke(startActivityIntentAction.parameters));
            if (startActivityIntent.getData() == null) {
                startActivityIntent.setData(createUniqueUri(translationContext, i, 5, ""));
            }
            return PendingIntent.getActivity(context, 0, startActivityIntent, 201326592, null);
        }
        if (!(action instanceof LambdaAction)) {
            Path$$ExternalSyntheticBUOutline0.m$1(action, "Cannot create PendingIntent for action type: ");
            return null;
        }
        ComponentName componentName = translationContext.actionBroadcastReceiver;
        if (componentName == null) {
            a$$ExternalSyntheticBUOutline0.m$3("In order to use LambdaAction, actionBroadcastReceiver must be provided");
            return null;
        }
        Intent putExtra = new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", translationContext.appWidgetId);
        putExtra.setData(createUniqueUri(translationContext, i, 5, null));
        return PendingIntent.getBroadcast(context, 0, putExtra, 201326592);
    }

    public static final Intent getStartActivityIntent(StartActivityIntentAction startActivityIntentAction, MutableActionParameters mutableActionParameters) {
        if (!(startActivityIntentAction instanceof StartActivityIntentAction)) {
            Path$$ExternalSyntheticBUOutline0.m$1(startActivityIntentAction, "Action type not defined in app widget package: ");
            return null;
        }
        Intent intent = startActivityIntentAction.intent;
        Map unmodifiableMap = Collections.unmodifiableMap(mutableActionParameters.map);
        ArrayList arrayList = new ArrayList(unmodifiableMap.size());
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            ActionParameters$Key actionParameters$Key = (ActionParameters$Key) entry.getKey();
            arrayList.add(new Pair(actionParameters$Key.name, entry.getValue()));
        }
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        intent.putExtras(BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        return intent;
    }

    public static final void launchTrampolineAction(Activity activity, Intent intent) {
        StrictMode.VmPolicy build;
        Parcelable parcelableExtra = intent.getParcelableExtra("ACTION_INTENT");
        if (parcelableExtra == null) {
            a$$ExternalSyntheticBUOutline0.m$3("List adapter activity trampoline invoked without specifying target intent.");
            return;
        }
        Intent intent2 = (Intent) parcelableExtra;
        if (intent.hasExtra("android.widget.extra.CHECKED")) {
            intent2.putExtra("android.widget.extra.CHECKED", intent.getBooleanExtra("android.widget.extra.CHECKED", false));
        }
        String stringExtra = intent.getStringExtra("ACTION_TYPE");
        if (stringExtra == null) {
            a$$ExternalSyntheticBUOutline0.m$3("List adapter activity trampoline invoked without trampoline type");
            return;
        }
        AndroidPopup_androidKt$Popup$3$1 androidPopup_androidKt$Popup$3$1 = new AndroidPopup_androidKt$Popup$3$1(stringExtra, activity, intent2, intent.getBundleExtra("ACTIVITY_OPTIONS"), 3);
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            build = StrictModeVmPolicyApi31Impl.INSTANCE.permitUnsafeIntentLaunch(new StrictMode.VmPolicy.Builder(vmPolicy)).build();
        } else {
            build = new StrictMode.VmPolicy.Builder().build();
        }
        StrictMode.setVmPolicy(build);
        androidPopup_androidKt$Popup$3$1.invoke();
        StrictMode.setVmPolicy(vmPolicy);
        activity.finish();
    }
}
