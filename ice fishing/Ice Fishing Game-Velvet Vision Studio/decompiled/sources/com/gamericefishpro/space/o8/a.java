package com.gamericefishpro.space.o8;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final /* synthetic */ int a;
    public final boolean b;
    public final String c;

    public /* synthetic */ a(String str, boolean z, int i) {
        this.a = i;
        this.c = str;
        this.b = z;
    }

    public String toString() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String str = this.c;
                int length = String.valueOf(str).length();
                boolean z = this.b;
                StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(z).length());
                sb.append("{");
                sb.append(str);
                sb.append("}");
                sb.append(z);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(boolean z, String str, int i) {
        this.a = i;
        this.b = z;
        this.c = str;
    }
}
