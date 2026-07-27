package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* loaded from: classes2.dex */
public final class S6 implements PackageManager$OnChecksumsReadyListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27508a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27509b;

    public /* synthetic */ S6(int i, Object obj) {
        this.f27508a = i;
        this.f27509b = obj;
    }

    public final void onChecksumsReady(List list) {
        int type;
        byte[] value;
        int type2;
        byte[] value2;
        int type3;
        byte[] value3;
        int i = 0;
        Object obj = this.f27509b;
        switch (this.f27508a) {
            case 0:
                if (list == null) {
                    ((ZD) obj).d("");
                    break;
                } else {
                    try {
                        int size = list.size();
                        while (i < size) {
                            ApkChecksum e6 = N0.a.e(list.get(i));
                            type = e6.getType();
                            if (type == 8) {
                                HC f6 = HC.f25322f.f();
                                value = e6.getValue();
                                ((ZD) obj).d(f6.g(value.length, value));
                                break;
                            } else {
                                i++;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    ((ZD) obj).d("");
                    break;
                }
            case 1:
                ZD zd = (ZD) obj;
                if (list == null) {
                    zd.d(null);
                    break;
                } else {
                    try {
                        int size2 = list.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            ApkChecksum e9 = N0.a.e(list.get(i4));
                            type2 = e9.getType();
                            if (type2 == 8) {
                                value2 = e9.getValue();
                                char[] cArr = AbstractC4263z7.f35480a;
                                int length = value2.length;
                                char[] cArr2 = new char[length + length];
                                while (i < value2.length) {
                                    byte b9 = value2[i];
                                    char[] cArr3 = AbstractC4263z7.f35480a;
                                    int i9 = i + i;
                                    cArr2[i9] = cArr3[(b9 & 255) >>> 4];
                                    cArr2[i9 + 1] = cArr3[b9 & 15];
                                    i++;
                                }
                                zd.d(new String(cArr2));
                                break;
                            }
                        }
                        zd.d(null);
                        break;
                    } catch (Throwable unused2) {
                        zd.d(null);
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
                            ApkChecksum e10 = N0.a.e(list.get(i));
                            type3 = e10.getType();
                            if (type3 == 8) {
                                HC f9 = HC.f25322f.f();
                                value3 = e10.getValue();
                                hVar.a(f9.g(value3.length, value3));
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

    public S6() {
        this.f27508a = 0;
        this.f27509b = new ZD();
    }
}
