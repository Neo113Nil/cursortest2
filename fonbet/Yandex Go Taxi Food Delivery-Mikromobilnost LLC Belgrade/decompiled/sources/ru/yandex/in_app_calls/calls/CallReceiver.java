package ru.yandex.in_app_calls.calls;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.f69;
import defpackage.gw00;
import defpackage.hj7;
import defpackage.tcc;
import defpackage.xi7;
import defpackage.yj7;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.b;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lru/yandex/in_app_calls/calls/CallReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Companion", "yj7", "calls_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CallReceiver extends BroadcastReceiver {
    public static final String ACTION_ACCEPT = "ru.yandex.in_app_calls.calls.ACTION_ACCEPT";
    public static final String ACTION_DECLINE = "ru.yandex.in_app_calls.calls.ACTION_DECLINE";
    public static final String ACTION_DISMISS = "ru.yandex.in_app_calls.calls.ACTION_DISMISS";
    public static final String ACTION_HANGUP = "ru.yandex.in_app_calls.calls.ACTION_HANGUP";
    public static final yj7 Companion = new yj7();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        hj7 hj7Var;
        hj7 hj7Var2;
        hj7 hj7Var3;
        hj7 hj7Var4;
        Set<String> keySet;
        Bundle extras = intent.getExtras();
        Map map = null;
        if (extras != null && (keySet = extras.keySet()) != null) {
            Set<String> set = keySet;
            int d = gw00.d(tcc.n(set, 10));
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
            for (Object obj : set) {
                String str = (String) obj;
                Bundle extras2 = intent.getExtras();
                linkedHashMap.put(obj, extras2 != null ? extras2.get(str) : null);
            }
            map = b.t(linkedHashMap);
        }
        f69 f69Var = xi7.a;
        f69.k("onReceive action: " + intent.getAction() + ", extras: " + map, Collections.singletonList("CallReceiver"));
        String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -348792507:
                    if (action.equals(ACTION_DECLINE) && (hj7Var = hj7.w) != null) {
                        hj7Var.f("decline", map);
                        break;
                    }
                    break;
                case -219469607:
                    if (action.equals(ACTION_DISMISS) && (hj7Var2 = hj7.w) != null) {
                        hj7Var2.f("dismiss", map);
                        break;
                    }
                    break;
                case 1425028281:
                    if (action.equals(ACTION_ACCEPT) && (hj7Var3 = hj7.w) != null) {
                        hj7Var3.f("accept", map);
                        break;
                    }
                    break;
                case 1623915070:
                    if (action.equals(ACTION_HANGUP) && (hj7Var4 = hj7.w) != null) {
                        hj7Var4.f("hangup", map);
                        break;
                    }
                    break;
            }
        }
    }
}
