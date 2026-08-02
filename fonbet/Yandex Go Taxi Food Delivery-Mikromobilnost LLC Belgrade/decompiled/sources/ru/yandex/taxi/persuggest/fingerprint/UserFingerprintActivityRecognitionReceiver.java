package ru.yandex.taxi.persuggest.fingerprint;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import defpackage.gm21;
import defpackage.h6r;
import defpackage.hm21;
import defpackage.jm21;
import defpackage.tcc;
import defpackage.wwg;
import defpackage.zzf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/persuggest/fingerprint/UserFingerprintActivityRecognitionReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserFingerprintActivityRecognitionReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ActivityRecognitionResult extractResult;
        int i;
        int i2;
        if (intent == null) {
            return;
        }
        hm21 hm21Var = (hm21) ((zzf) ((h6r) wwg.e(context, h6r.class))).Ni.get();
        hm21Var.getClass();
        if (ActivityRecognitionResult.hasResult(intent) && (extractResult = ActivityRecognitionResult.extractResult(intent)) != null) {
            AtomicReference atomicReference = hm21Var.a;
            DetectedActivity mostProbableActivity = extractResult.getMostProbableActivity();
            List x0 = kotlin.collections.a.x0(extractResult.getProbableActivities(), new jm21());
            ArrayList arrayList = new ArrayList(tcc.n(x0, 10));
            Iterator it = x0.iterator();
            while (true) {
                i = 4;
                i2 = 0;
                if (!it.hasNext()) {
                    break;
                }
                int type = ((DetectedActivity) it.next()).getType();
                if (type == 0) {
                    i = 3;
                } else if (type != 1) {
                    if (type != 2) {
                        if (type == 3) {
                            i = 0;
                        } else if (type != 7) {
                            i = type != 8 ? 5 : 2;
                        }
                    }
                    i = 1;
                }
                arrayList.add(Integer.valueOf(i));
            }
            List A0 = kotlin.collections.a.A0(kotlin.collections.a.I(arrayList), 2);
            if (A0.isEmpty()) {
                int type2 = mostProbableActivity.getType();
                if (type2 == 0) {
                    i = 3;
                } else if (type2 != 1) {
                    if (type2 != 2) {
                        if (type2 == 3) {
                            i = 0;
                        } else if (type2 != 7) {
                            i = type2 != 8 ? 5 : 2;
                        }
                    }
                    i = 1;
                }
                A0 = Collections.singletonList(Integer.valueOf(i));
            }
            int confidence = mostProbableActivity.getConfidence();
            if (confidence >= 67) {
                i2 = 2;
            } else if (confidence >= 34) {
                i2 = 1;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            gm21 gm21Var = (gm21) atomicReference.get();
            if (gm21Var != null && gm21Var.a.equals(A0)) {
                elapsedRealtime = gm21Var.c;
            }
            atomicReference.set(new gm21(i2, elapsedRealtime, A0));
        }
    }
}
