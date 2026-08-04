package com.gamericefishpro.space.f2;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public final /* synthetic */ int a;
    public final m b;
    public final m c;
    public final m d;
    public final m e;
    public final Serializable f;

    public n(String str) {
        this.a = 1;
        this.f = str;
        this.b = new m(1, null);
        this.c = new m(0, null);
        this.d = new m(1, null);
        this.e = new m(0, null);
    }

    public final m a() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
        }
        return this.e;
    }

    public final m b() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
        }
        return this.b;
    }

    public final m c() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
        }
        return this.d;
    }

    public final m d() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
        }
        return this.c;
    }

    public final String toString() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return com.gamericefishpro.space.ph.v.v(57, (n[]) this.f);
            default:
                String str = (String) this.f;
                if (str == null) {
                    return super.toString();
                }
                return "RectRulers(" + str + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(n[] nVarArr) {
        this.a = 0;
        this.f = nVarArr;
        int length = nVarArr.length;
        m[] mVarArr = new m[length];
        for (int i = 0; i < length; i++) {
            mVarArr[i] = ((n[]) this.f)[i].b();
        }
        this.b = new m(1, new l1(mVarArr, 0));
        int length2 = ((n[]) this.f).length;
        m[] mVarArr2 = new m[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            mVarArr2[i2] = ((n[]) this.f)[i2].d();
        }
        this.c = new m(0, new l(mVarArr2, 0));
        int length3 = ((n[]) this.f).length;
        m[] mVarArr3 = new m[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            mVarArr3[i3] = ((n[]) this.f)[i3].c();
        }
        this.d = new m(1, new l1(mVarArr3, 1));
        int length4 = ((n[]) this.f).length;
        m[] mVarArr4 = new m[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            mVarArr4[i4] = ((n[]) this.f)[i4].a();
        }
        this.e = new m(0, new l(mVarArr4, 1));
    }
}
