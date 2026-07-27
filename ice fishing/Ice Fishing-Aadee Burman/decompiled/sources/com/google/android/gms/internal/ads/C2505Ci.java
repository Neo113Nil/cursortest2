package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.HashMap;
import u2.C5069B;

/* renamed from: com.google.android.gms.internal.ads.Ci, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2505Ci implements InterfaceC2488Bi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24208a;

    /* renamed from: b, reason: collision with root package name */
    public final C5069B f24209b;

    public /* synthetic */ C2505Ci(C5069B c5069b, int i) {
        this.f24208a = i;
        this.f24209b = c5069b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2488Bi
    public final void a(HashMap hashMap) {
        int intValue;
        int intValue2;
        switch (this.f24208a) {
            case 0:
                boolean parseBoolean = Boolean.parseBoolean((String) hashMap.get("content_url_opted_out"));
                C5069B c5069b = this.f24209b;
                c5069b.i();
                synchronized (c5069b.f41206a) {
                    try {
                        if (c5069b.f41225u == parseBoolean) {
                            return;
                        }
                        c5069b.f41225u = parseBoolean;
                        SharedPreferences.Editor editor = c5069b.f41212g;
                        if (editor != null) {
                            editor.putBoolean("content_url_opted_out", parseBoolean);
                            c5069b.f41212g.apply();
                        }
                        c5069b.j();
                        return;
                    } finally {
                    }
                }
            case 1:
                boolean parseBoolean2 = Boolean.parseBoolean((String) hashMap.get("content_vertical_opted_out"));
                C5069B c5069b2 = this.f24209b;
                c5069b2.i();
                synchronized (c5069b2.f41206a) {
                    try {
                        if (c5069b2.f41226v == parseBoolean2) {
                            return;
                        }
                        c5069b2.f41226v = parseBoolean2;
                        SharedPreferences.Editor editor2 = c5069b2.f41212g;
                        if (editor2 != null) {
                            editor2.putBoolean("content_vertical_opted_out", parseBoolean2);
                            c5069b2.f41212g.apply();
                        }
                        c5069b2.j();
                        return;
                    } finally {
                    }
                }
            case 2:
                String str = (String) hashMap.get("default_queue_capacity");
                if (str == null || (intValue = Float.valueOf(str).intValue()) <= 0) {
                    return;
                }
                C5069B c5069b3 = this.f24209b;
                c5069b3.i();
                synchronized (c5069b3.f41206a) {
                    try {
                        if (c5069b3.f41205G == intValue) {
                            return;
                        }
                        c5069b3.f41205G = intValue;
                        SharedPreferences.Editor editor3 = c5069b3.f41212g;
                        if (editor3 != null) {
                            editor3.putInt("default_queue_capacity", intValue);
                            c5069b3.f41212g.apply();
                        }
                        c5069b3.j();
                        return;
                    } finally {
                    }
                }
            default:
                String str2 = (String) hashMap.get("total_inflight_ad_limit");
                if (str2 == null || (intValue2 = Float.valueOf(str2).intValue()) <= 0) {
                    return;
                }
                C5069B c5069b4 = this.f24209b;
                c5069b4.i();
                synchronized (c5069b4.f41206a) {
                    try {
                        if (c5069b4.f41204F == intValue2) {
                            return;
                        }
                        c5069b4.f41204F = intValue2;
                        SharedPreferences.Editor editor4 = c5069b4.f41212g;
                        if (editor4 != null) {
                            editor4.putInt("total_inflight_ad_limit", intValue2);
                            c5069b4.f41212g.apply();
                        }
                        c5069b4.j();
                        return;
                    } finally {
                    }
                }
        }
    }
}
