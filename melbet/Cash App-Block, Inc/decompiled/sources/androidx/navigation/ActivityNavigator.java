package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.navigation.Navigator;
import androidx.navigation.internal.NavDestinationImpl;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Navigator.Name("activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/ActivityNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/ActivityNavigator$Destination;", "Destination", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class ActivityNavigator extends Navigator {
    public final Context context;
    public final Activity hostActivity;

    public final class Destination extends NavDestination {
        public String dataPattern;
        public Intent intent;

        public static String parseApplicationId(Context context, String str) {
            if (str == null) {
                return null;
            }
            String packageName = context.getPackageName();
            packageName.getClass();
            return StringsKt__StringsJVMKt.replace$default(str, "${applicationId}", packageName);
        }

        @Override // androidx.navigation.NavDestination
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof Destination) && super.equals(obj)) {
                Intent intent = this.intent;
                if ((intent != null ? intent.filterEquals(((Destination) obj).intent) : ((Destination) obj).intent == null) && Intrinsics.areEqual(this.dataPattern, ((Destination) obj).dataPattern)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.navigation.NavDestination
        public final int hashCode() {
            int hashCode = super.hashCode() * 31;
            Intent intent = this.intent;
            int filterHashCode = (hashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.dataPattern;
            return filterHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.NavDestination
        public final void onInflate(Context context, AttributeSet attributeSet) {
            context.getClass();
            super.onInflate(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R$styleable.ActivityNavigator);
            obtainAttributes.getClass();
            String parseApplicationId = parseApplicationId(context, obtainAttributes.getString(4));
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            intent.getClass();
            intent.setPackage(parseApplicationId);
            String string2 = obtainAttributes.getString(0);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                ComponentName componentName = new ComponentName(context, string2);
                if (this.intent == null) {
                    this.intent = new Intent();
                }
                Intent intent2 = this.intent;
                intent2.getClass();
                intent2.setComponent(componentName);
            }
            String string3 = obtainAttributes.getString(1);
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent3 = this.intent;
            intent3.getClass();
            intent3.setAction(string3);
            String parseApplicationId2 = parseApplicationId(context, obtainAttributes.getString(2));
            if (parseApplicationId2 != null) {
                Uri parse = Uri.parse(parseApplicationId2);
                if (this.intent == null) {
                    this.intent = new Intent();
                }
                Intent intent4 = this.intent;
                intent4.getClass();
                intent4.setData(parse);
            }
            this.dataPattern = parseApplicationId(context, obtainAttributes.getString(3));
            obtainAttributes.recycle();
        }

        @Override // androidx.navigation.NavDestination
        public final String toString() {
            Intent intent = this.intent;
            ComponentName component = intent != null ? intent.getComponent() : null;
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (component != null) {
                sb.append(" class=");
                sb.append(component.getClassName());
            } else {
                Intent intent2 = this.intent;
                String action = intent2 != null ? intent2.getAction() : null;
                if (action != null) {
                    sb.append(" action=");
                    sb.append(action);
                }
            }
            return sb.toString();
        }
    }

    public ActivityNavigator(Context context) {
        Object obj;
        context.getClass();
        this.context = context;
        Iterator it = SequencesKt__SequencesKt.generateSequence(new Navigation$$ExternalSyntheticLambda1(15), context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.hostActivity = (Activity) obj;
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination createDestination() {
        return new Destination(this);
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination navigate(NavDestination navDestination, Bundle bundle, NavOptions navOptions) {
        Intent intent;
        int intExtra;
        Destination destination = (Destination) navDestination;
        Intent intent2 = destination.intent;
        NavDestinationImpl navDestinationImpl = destination.impl;
        if (intent2 == null) {
            Path$$ExternalSyntheticBUOutline0.m((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(navDestinationImpl.id, " does not have an Intent set.", new StringBuilder("Destination ")));
            return null;
        }
        Intent intent3 = new Intent(destination.intent);
        if (bundle != null) {
            intent3.putExtras(bundle);
            String str = destination.dataPattern;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String group = matcher.group(1);
                    group.getClass();
                    if (!bundle.containsKey(group)) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Could not find ", group, " in ", bundle, " to fill data pattern ", str);
                        return null;
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    NavArgument navArgument = (NavArgument) destination.getArguments().get(group);
                    NavType navType = navArgument != null ? navArgument.f901type : null;
                    stringBuffer.append(navType != null ? navType.serializeAsValue(navType.get(bundle, group)) : Uri.encode(String.valueOf(bundle.get(group))));
                }
                matcher.appendTail(stringBuffer);
                intent3.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.hostActivity;
        if (activity == null) {
            intent3.addFlags(268435456);
        }
        if (navOptions != null && navOptions.singleTop) {
            intent3.addFlags(PKIFailureInfo.duplicateCertReq);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent3.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent3.putExtra("android-support-navigation:ActivityNavigator:current", navDestinationImpl.id);
        Context context = this.context;
        Resources resources = context.getResources();
        if (navOptions != null) {
            int i = navOptions.popEnterAnim;
            int i2 = navOptions.popExitAnim;
            if ((i <= 0 || !Intrinsics.areEqual(resources.getResourceTypeName(i), "animator")) && (i2 <= 0 || !Intrinsics.areEqual(resources.getResourceTypeName(i2), "animator"))) {
                intent3.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                intent3.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i2).getClass();
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i) + " and popExit resource " + resources.getResourceName(i2) + " when launching " + destination);
            }
        }
        context.startActivity(intent3);
        if (navOptions != null && activity != null) {
            int i3 = navOptions.enterAnim;
            int i4 = navOptions.exitAnim;
            if ((i3 > 0 && Intrinsics.areEqual(resources.getResourceTypeName(i3), "animator")) || (i4 > 0 && Intrinsics.areEqual(resources.getResourceTypeName(i4), "animator"))) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i3) + " and exit resource " + resources.getResourceName(i4) + "when launching " + destination);
                return null;
            }
            if (i3 >= 0 || i4 >= 0) {
                if (i3 < 0) {
                    i3 = 0;
                }
                activity.overridePendingTransition(i3, i4 >= 0 ? i4 : 0);
            }
        }
        return null;
    }

    @Override // androidx.navigation.Navigator
    public final boolean popBackStack() {
        Activity activity = this.hostActivity;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
