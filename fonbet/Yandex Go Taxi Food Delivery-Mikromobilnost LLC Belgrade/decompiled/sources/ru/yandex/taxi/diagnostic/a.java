package ru.yandex.taxi.diagnostic;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.LabeledIntent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import androidx.core.content.FileProvider;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ActionBroadcastReceiver;
import defpackage.b03;
import defpackage.b64;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.jst;
import defpackage.ny61;
import defpackage.rcj;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a {
    public final Context a;
    public final tt2 b;
    public final dne0 c;
    public final b03 d;

    public a(Context context, tt2 tt2Var, dne0 dne0Var, b03 b03Var) {
        this.a = context;
        this.b = tt2Var;
        this.c = dne0Var;
        this.d = b03Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b8 A[LOOP:0: B:11:0x00b2->B:13:0x00b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        DiagnosticModeInteractor$sendReport$1 diagnosticModeInteractor$sendReport$1;
        int i;
        String str3;
        String str4;
        ArrayList arrayList;
        a aVar = this;
        if (continuationImpl instanceof DiagnosticModeInteractor$sendReport$1) {
            diagnosticModeInteractor$sendReport$1 = (DiagnosticModeInteractor$sendReport$1) continuationImpl;
            int i2 = diagnosticModeInteractor$sendReport$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diagnosticModeInteractor$sendReport$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diagnosticModeInteractor$sendReport$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diagnosticModeInteractor$sendReport$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    try {
                        try {
                            ((BufferedWriter) rcj.c.getValue()).close();
                        } catch (IOException unused) {
                            jst.e.getClass();
                        }
                        ((cne0) rcj.b.getValue()).u("FIELD_DIAGNOSTIC_MODE_ENABLED", false);
                        aVar.b.getClass();
                        sjh sjhVar = uyj.a;
                        DiagnosticModeInteractor$sendReport$encryptedContent$1 diagnosticModeInteractor$sendReport$encryptedContent$1 = new DiagnosticModeInteractor$sendReport$encryptedContent$1();
                        diagnosticModeInteractor$sendReport$1.L$0 = str;
                        diagnosticModeInteractor$sendReport$1.L$1 = str2;
                        diagnosticModeInteractor$sendReport$1.label = 1;
                        obj = tje.k0(sjhVar, diagnosticModeInteractor$sendReport$encryptedContent$1, diagnosticModeInteractor$sendReport$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str3 = str;
                        str4 = str2;
                    } catch (Throwable th) {
                        ((cne0) rcj.b.getValue()).u("FIELD_DIAGNOSTIC_MODE_ENABLED", false);
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str4 = (String) diagnosticModeInteractor$sendReport$1.L$1;
                    str3 = (String) diagnosticModeInteractor$sendReport$1.L$0;
                    kotlin.b.b(obj);
                }
                String str5 = (String) obj;
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "blogs@taxi.yandex.ru", null));
                intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, "Mail subject");
                Context context = aVar.a;
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
                arrayList = new ArrayList(tcc.n(queryIntentActivities, 10));
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    Intent intent2 = new Intent("android.intent.action.SEND_MULTIPLE");
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                    intent2.putExtra("android.intent.extra.EMAIL", new String[]{"blogs@taxi.yandex.ru"});
                    intent2.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, b64.l("Diagnostic report ", str3, " ", str4));
                    intent2.putExtra("android.intent.extra.TEXT", str5);
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    arrayList2.add(FileProvider.getUriForFile(context, String.format(Locale.getDefault(), "%s.diagnostic.FileProvider", Arrays.copyOf(new Object[]{aVar.d.getApplicationId()}, i3)), new File(new File(context.getFilesDir(), "diagnostic"), "diagnostic_log.txt")));
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList2);
                    arrayList.add(new LabeledIntent(intent2, resolveInfo.activityInfo.packageName, resolveInfo.loadLabel(context.getPackageManager()), resolveInfo.icon));
                    aVar = this;
                    i3 = i3;
                }
                if (!arrayList.isEmpty()) {
                    Intent createChooser = Intent.createChooser((Intent) kotlin.collections.a.Z(arrayList), "Send email with attachments...");
                    List subList = arrayList.subList(0, arrayList.size() - 1);
                    if (!subList.isEmpty()) {
                        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) subList.toArray(new LabeledIntent[0]));
                    }
                    context.startActivity(createChooser);
                }
                return zy11.a;
            }
        }
        diagnosticModeInteractor$sendReport$1 = new DiagnosticModeInteractor$sendReport$1(aVar, continuationImpl);
        Object obj2 = diagnosticModeInteractor$sendReport$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diagnosticModeInteractor$sendReport$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        String str52 = (String) obj2;
        Intent intent3 = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "blogs@taxi.yandex.ru", null));
        intent3.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, "Mail subject");
        Context context2 = aVar.a;
        List<ResolveInfo> queryIntentActivities2 = context2.getPackageManager().queryIntentActivities(intent3, 0);
        arrayList = new ArrayList(tcc.n(queryIntentActivities2, 10));
        while (r4.hasNext()) {
        }
        if (!arrayList.isEmpty()) {
        }
        return zy11.a;
    }
}
