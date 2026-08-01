package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* loaded from: classes2.dex */
public final class V6 implements PackageManager$OnChecksumsReadyListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28094a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f28095b;

    public /* synthetic */ V6(int i, Object obj) {
        this.f28094a = i;
        this.f28095b = obj;
    }

    public final void onChecksumsReady(List list) {
        int type;
        byte[] value;
        int type2;
        byte[] value2;
        int type3;
        byte[] value3;
        int i = 0;
        Object obj = this.f28095b;
        switch (this.f28094a) {
            case 0:
                if (list == null) {
                    ((XD) obj).d("");
                    break;
                } else {
                    try {
                        int size = list.size();
                        while (i < size) {
                            ApkChecksum f3 = B3.e.f(list.get(i));
                            type = f3.getType();
                            if (type == 8) {
                                EC f9 = EC.f24557f.f();
                                value = f3.getValue();
                                ((XD) obj).d(f9.g(value.length, value));
                                break;
                            } else {
                                i++;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    ((XD) obj).d("");
                    break;
                }
            case 1:
                XD xd = (XD) obj;
                if (list == null) {
                    xd.d(null);
                    break;
                } else {
                    try {
                        int size2 = list.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            ApkChecksum f10 = B3.e.f(list.get(i6));
                            type2 = f10.getType();
                            if (type2 == 8) {
                                value2 = f10.getValue();
                                char[] cArr = A7.f23634a;
                                int length = value2.length;
                                char[] cArr2 = new char[length + length];
                                while (i < value2.length) {
                                    byte b9 = value2[i];
                                    char[] cArr3 = A7.f23634a;
                                    int i9 = i + i;
                                    cArr2[i9] = cArr3[(b9 & 255) >>> 4];
                                    cArr2[i9 + 1] = cArr3[b9 & 15];
                                    i++;
                                }
                                xd.d(new String(cArr2));
                                break;
                            }
                        }
                        xd.d(null);
                        break;
                    } catch (Throwable unused2) {
                        xd.d(null);
                        return;
                    }
                }
            default:
                t.h hVar = (t.h) obj;
                if (list == null) {
                    hVar.a("");
                    break;
                } else {
                    try {
                        int size3 = list.size();
                        while (i < size3) {
                            ApkChecksum f11 = B3.e.f(list.get(i));
                            type3 = f11.getType();
                            if (type3 == 8) {
                                EC f12 = EC.f24557f.f();
                                value3 = f11.getValue();
                                hVar.a(f12.g(value3.length, value3));
                                break;
                            } else {
                                i++;
                            }
                        }
                    } catch (Throwable unused3) {
                    }
                    hVar.a("");
                    break;
                }
        }
    }

    public V6() {
        this.f28094a = 0;
        this.f28095b = new XD();
    }
}
