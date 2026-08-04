package com.gamericefishpro.space.i2;

import com.android.installreferrer.api.InstallReferrerClient;
import java.text.BreakIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.gamericefishpro.space.f.b {
    public static b e;
    public static b f;
    public final /* synthetic */ int c;
    public BreakIterator d;

    public boolean A(int i) {
        if (i < 0 || i >= n().length()) {
            return false;
        }
        return Character.isLetterOrDigit(n().codePointAt(i));
    }

    @Override // com.gamericefishpro.space.f.b
    public final int[] b(int i) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int length = n().length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = this.d;
                    if (breakIterator == null) {
                        Intrinsics.h("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i)) {
                        BreakIterator breakIterator2 = this.d;
                        if (breakIterator2 == null) {
                            Intrinsics.h("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return l(i, iFollowing);
                    }
                    BreakIterator breakIterator3 = this.d;
                    if (breakIterator3 == null) {
                        Intrinsics.h("impl");
                        throw null;
                    }
                    i = breakIterator3.following(i);
                } while (i != -1);
                return null;
            default:
                if (n().length() <= 0 || i >= n().length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!A(i) && (!A(i) || (i != 0 && A(i - 1)))) {
                    BreakIterator breakIterator4 = this.d;
                    if (breakIterator4 == null) {
                        Intrinsics.h("impl");
                        throw null;
                    }
                    i = breakIterator4.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.d;
                if (breakIterator5 == null) {
                    Intrinsics.h("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator5.following(i);
                if (iFollowing2 == -1 || !z(iFollowing2)) {
                    return null;
                }
                return l(i, iFollowing2);
        }
    }

    @Override // com.gamericefishpro.space.f.b
    public final int[] x(int i) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int length = n().length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = this.d;
                    if (breakIterator == null) {
                        Intrinsics.h("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i)) {
                        BreakIterator breakIterator2 = this.d;
                        if (breakIterator2 == null) {
                            Intrinsics.h("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return l(iPreceding, i);
                    }
                    BreakIterator breakIterator3 = this.d;
                    if (breakIterator3 == null) {
                        Intrinsics.h("impl");
                        throw null;
                    }
                    i = breakIterator3.preceding(i);
                } while (i != -1);
                return null;
            default:
                int length2 = n().length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !A(i - 1) && !z(i)) {
                    BreakIterator breakIterator4 = this.d;
                    if (breakIterator4 == null) {
                        Intrinsics.h("impl");
                        throw null;
                    }
                    i = breakIterator4.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.d;
                if (breakIterator5 == null) {
                    Intrinsics.h("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator5.preceding(i);
                if (iPreceding2 == -1 || !A(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !A(iPreceding2 - 1)) {
                    return l(iPreceding2, i);
                }
                return null;
        }
    }

    public final void y(String str) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.a = str;
                BreakIterator breakIterator = this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    Intrinsics.h("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    Intrinsics.h("impl");
                    throw null;
                }
        }
    }

    public boolean z(int i) {
        if (i <= 0 || !A(i - 1)) {
            return false;
        }
        return i == n().length() || !A(i);
    }
}
