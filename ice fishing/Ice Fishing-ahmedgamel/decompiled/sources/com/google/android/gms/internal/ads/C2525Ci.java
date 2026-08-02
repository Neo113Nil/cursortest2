package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.HashMap;
import w2.C5140B;

/* renamed from: com.google.android.gms.internal.ads.Ci, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2525Ci implements InterfaceC2508Bi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24943a;

    /* renamed from: b, reason: collision with root package name */
    public final C5140B f24944b;

    public /* synthetic */ C2525Ci(C5140B c5140b, int i) {
        this.f24943a = i;
        this.f24944b = c5140b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2508Bi
    public final void a(HashMap hashMap) {
        int intValue;
        int intValue2;
        switch (this.f24943a) {
            case 0:
                boolean parseBoolean = Boolean.parseBoolean((String) hashMap.get("content_url_opted_out"));
                C5140B c5140b = this.f24944b;
                c5140b.i();
                synchronized (c5140b.f41599a) {
                    try {
                        if (c5140b.f41618u == parseBoolean) {
                            return;
                        }
                        c5140b.f41618u = parseBoolean;
                        SharedPreferences.Editor editor = c5140b.f41605g;
                        if (editor != null) {
                            editor.putBoolean("content_url_opted_out", parseBoolean);
                            c5140b.f41605g.apply();
                        }
                        c5140b.j();
                        return;
                    } finally {
                    }
                }
            case 1:
                boolean parseBoolean2 = Boolean.parseBoolean((String) hashMap.get("content_vertical_opted_out"));
                C5140B c5140b2 = this.f24944b;
                c5140b2.i();
                synchronized (c5140b2.f41599a) {
                    try {
                        if (c5140b2.f41619v == parseBoolean2) {
                            return;
                        }
                        c5140b2.f41619v = parseBoolean2;
                        SharedPreferences.Editor editor2 = c5140b2.f41605g;
                        if (editor2 != null) {
                            editor2.putBoolean("content_vertical_opted_out", parseBoolean2);
                            c5140b2.f41605g.apply();
                        }
                        c5140b2.j();
                        return;
                    } finally {
                    }
                }
            case 2:
                String str = (String) hashMap.get("default_queue_capacity");
                if (str == null || (intValue = Float.valueOf(str).intValue()) <= 0) {
                    return;
                }
                C5140B c5140b3 = this.f24944b;
                c5140b3.i();
                synchronized (c5140b3.f41599a) {
                    try {
                        if (c5140b3.f41598G == intValue) {
                            return;
                        }
                        c5140b3.f41598G = intValue;
                        SharedPreferences.Editor editor3 = c5140b3.f41605g;
                        if (editor3 != null) {
                            editor3.putInt("default_queue_capacity", intValue);
                            c5140b3.f41605g.apply();
                        }
                        c5140b3.j();
                        return;
                    } finally {
                    }
                }
            default:
                String str2 = (String) hashMap.get("total_inflight_ad_limit");
                if (str2 == null || (intValue2 = Float.valueOf(str2).intValue()) <= 0) {
                    return;
                }
                C5140B c5140b4 = this.f24944b;
                c5140b4.i();
                synchronized (c5140b4.f41599a) {
                    try {
                        if (c5140b4.f41597F == intValue2) {
                            return;
                        }
                        c5140b4.f41597F = intValue2;
                        SharedPreferences.Editor editor4 = c5140b4.f41605g;
                        if (editor4 != null) {
                            editor4.putInt("total_inflight_ad_limit", intValue2);
                            c5140b4.f41605g.apply();
                        }
                        c5140b4.j();
                        return;
                    } finally {
                    }
                }
        }
    }
}
