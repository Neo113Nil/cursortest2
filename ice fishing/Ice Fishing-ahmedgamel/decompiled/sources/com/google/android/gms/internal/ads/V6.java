package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* loaded from: classes2.dex */
public final class V6 implements PackageManager$OnChecksumsReadyListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28891a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f28892b;

    public /* synthetic */ V6(int i, Object obj) {
        this.f28891a = i;
        this.f28892b = obj;
    }

    public final void onChecksumsReady(List list) {
        int type;
        byte[] value;
        int type2;
        byte[] value2;
        int type3;
        byte[] value3;
        int i = 0;
        Object obj = this.f28892b;
        switch (this.f28891a) {
            case 0:
                if (list == null) {
                    ((XD) obj).d("");
                    break;
                } else {
                    try {
                        int size = list.size();
                        while (i < size) {
                            ApkChecksum f2 = D3.e.f(list.get(i));
                            type = f2.getType();
                            if (type == 8) {
                                EC f9 = EC.f25318f.f();
                                value = f2.getValue();
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
                        for (int i4 = 0; i4 < size2; i4++) {
                            ApkChecksum f10 = D3.e.f(list.get(i4));
                            type2 = f10.getType();
                            if (type2 == 8) {
                                value2 = f10.getValue();
                                char[] cArr = A7.f24414a;
                                int length = value2.length;
                                char[] cArr2 = new char[length + length];
                                while (i < value2.length) {
                                    byte b9 = value2[i];
                                    char[] cArr3 = A7.f24414a;
                                    int i6 = i + i;
                                    cArr2[i6] = cArr3[(b9 & 255) >>> 4];
                                    cArr2[i6 + 1] = cArr3[b9 & 15];
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
                            ApkChecksum f11 = D3.e.f(list.get(i));
                            type3 = f11.getType();
                            if (type3 == 8) {
                                EC f12 = EC.f25318f.f();
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
        this.f28891a = 0;
        this.f28892b = new XD();
    }
}
