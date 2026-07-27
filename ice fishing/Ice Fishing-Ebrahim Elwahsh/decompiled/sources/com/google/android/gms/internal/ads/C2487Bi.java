package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Bi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2487Bi implements InterfaceC2470Ai {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24062a;

    /* renamed from: b, reason: collision with root package name */
    public final t2.E f24063b;

    public /* synthetic */ C2487Bi(t2.E e6, int i) {
        this.f24062a = i;
        this.f24063b = e6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2470Ai
    public final void a(HashMap hashMap) {
        int intValue;
        int intValue2;
        switch (this.f24062a) {
            case 0:
                boolean parseBoolean = Boolean.parseBoolean((String) hashMap.get("content_url_opted_out"));
                t2.E e6 = this.f24063b;
                e6.i();
                synchronized (e6.f40830a) {
                    try {
                        if (e6.f40849u == parseBoolean) {
                            return;
                        }
                        e6.f40849u = parseBoolean;
                        SharedPreferences.Editor editor = e6.f40836g;
                        if (editor != null) {
                            editor.putBoolean("content_url_opted_out", parseBoolean);
                            e6.f40836g.apply();
                        }
                        e6.j();
                        return;
                    } finally {
                    }
                }
            case 1:
                boolean parseBoolean2 = Boolean.parseBoolean((String) hashMap.get("content_vertical_opted_out"));
                t2.E e9 = this.f24063b;
                e9.i();
                synchronized (e9.f40830a) {
                    try {
                        if (e9.f40850v == parseBoolean2) {
                            return;
                        }
                        e9.f40850v = parseBoolean2;
                        SharedPreferences.Editor editor2 = e9.f40836g;
                        if (editor2 != null) {
                            editor2.putBoolean("content_vertical_opted_out", parseBoolean2);
                            e9.f40836g.apply();
                        }
                        e9.j();
                        return;
                    } finally {
                    }
                }
            case 2:
                String str = (String) hashMap.get("default_queue_capacity");
                if (str == null || (intValue = Float.valueOf(str).intValue()) <= 0) {
                    return;
                }
                t2.E e10 = this.f24063b;
                e10.i();
                synchronized (e10.f40830a) {
                    try {
                        if (e10.f40829G == intValue) {
                            return;
                        }
                        e10.f40829G = intValue;
                        SharedPreferences.Editor editor3 = e10.f40836g;
                        if (editor3 != null) {
                            editor3.putInt("default_queue_capacity", intValue);
                            e10.f40836g.apply();
                        }
                        e10.j();
                        return;
                    } finally {
                    }
                }
            default:
                String str2 = (String) hashMap.get("total_inflight_ad_limit");
                if (str2 == null || (intValue2 = Float.valueOf(str2).intValue()) <= 0) {
                    return;
                }
                t2.E e11 = this.f24063b;
                e11.i();
                synchronized (e11.f40830a) {
                    try {
                        if (e11.f40828F == intValue2) {
                            return;
                        }
                        e11.f40828F = intValue2;
                        SharedPreferences.Editor editor4 = e11.f40836g;
                        if (editor4 != null) {
                            editor4.putInt("total_inflight_ad_limit", intValue2);
                            e11.f40836g.apply();
                        }
                        e11.j();
                        return;
                    } finally {
                    }
                }
        }
    }
}
