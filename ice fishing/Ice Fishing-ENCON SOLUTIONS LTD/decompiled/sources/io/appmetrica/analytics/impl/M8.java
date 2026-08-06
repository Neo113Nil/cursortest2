package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* loaded from: classes.dex */
public final class M8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4741a;

    /* renamed from: b, reason: collision with root package name */
    public final R8 f4742b;

    /* renamed from: c, reason: collision with root package name */
    public O8 f4743c;

    public M8(R8 r8, int i2) {
        this.f4741a = i2;
        this.f4742b = r8;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        O8 o8;
        int i2;
        int i3;
        byte[] bArr;
        R8 r8 = this.f4742b;
        r8.getClass();
        try {
            bArr = r8.f4990c.get("event_hashes");
        } catch (Throwable unused) {
            P8 p8 = r8.f4988a;
            r8.f4989b.getClass();
            C0790u9 c0790u9 = new C0790u9();
            p8.getClass();
            o8 = new O8(c0790u9.f6991a, c0790u9.f6992b, c0790u9.f6993c, CollectionUtils.hashSetFromIntArray(c0790u9.f6994d));
        }
        if (bArr != null && bArr.length != 0) {
            P8 p82 = r8.f4988a;
            C0790u9 state = r8.f4989b.toState(bArr);
            p82.getClass();
            o8 = new O8(state.f6991a, state.f6992b, state.f6993c, CollectionUtils.hashSetFromIntArray(state.f6994d));
            this.f4743c = o8;
            i2 = o8.f4857c;
            i3 = this.f4741a;
            if (i2 == i3) {
                o8.f4857c = i3;
                o8.f4858d = 0;
                R8 r82 = this.f4742b;
                IBinaryDataHelper iBinaryDataHelper = r82.f4990c;
                Q8 q8 = r82.f4989b;
                r82.f4988a.getClass();
                iBinaryDataHelper.insert("event_hashes", q8.toByteArray((Q8) P8.a(o8)));
                return;
            }
            return;
        }
        P8 p83 = r8.f4988a;
        r8.f4989b.getClass();
        C0790u9 c0790u92 = new C0790u9();
        p83.getClass();
        o8 = new O8(c0790u92.f6991a, c0790u92.f6992b, c0790u92.f6993c, CollectionUtils.hashSetFromIntArray(c0790u92.f6994d));
        this.f4743c = o8;
        i2 = o8.f4857c;
        i3 = this.f4741a;
        if (i2 == i3) {
        }
    }
}
