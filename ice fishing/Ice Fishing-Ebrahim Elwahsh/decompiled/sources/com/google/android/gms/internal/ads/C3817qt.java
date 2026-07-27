package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.qt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3817qt implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33901a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C4117wN f33902b;

    /* renamed from: c, reason: collision with root package name */
    public final C4117wN f33903c;

    /* renamed from: d, reason: collision with root package name */
    public final C4009uN f33904d;

    /* renamed from: e, reason: collision with root package name */
    public final C4009uN f33905e;

    /* renamed from: f, reason: collision with root package name */
    public final C4009uN f33906f;

    /* renamed from: g, reason: collision with root package name */
    public final C4009uN f33907g;

    /* renamed from: h, reason: collision with root package name */
    public final C4117wN f33908h;

    public C3817qt(C4117wN c4117wN, C4009uN c4009uN, C4117wN c4117wN2, C4117wN c4117wN3, C4009uN c4009uN2, C4009uN c4009uN3, C4009uN c4009uN4) {
        this.f33902b = c4117wN;
        this.f33904d = c4009uN;
        this.f33903c = c4117wN2;
        this.f33908h = c4117wN3;
        this.f33905e = c4009uN2;
        this.f33906f = c4009uN3;
        this.f33907g = c4009uN4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f33901a) {
            case 0:
                return new C3763pt((Context) this.f33902b.f34977a, (Executor) this.f33904d.d(), (q2.g1) this.f33903c.f34977a, (C3214fi) this.f33908h.f34977a, (Fr) this.f33905e.d(), (Hr) this.f33906f.d(), new C3171eu(), (C3378il) this.f33907g.d());
            default:
                Context context = (Context) this.f33902b.f34977a;
                ExecutorService executorService = (ExecutorService) this.f33903c.f34977a;
                Zy zy = (Zy) this.f33904d.d();
                C3339hz c3339hz = (C3339hz) this.f33905e.d();
                File file = (File) this.f33906f.d();
                C4158xA c4158xA = (C4158xA) this.f33907g.d();
                C3066cy c3066cy = (C3066cy) this.f33908h.f34977a;
                AbstractC2917aC i = AbstractC2917aC.i(new C3445jz("oMAI9M+rfpAXD2NxGp+nC5qJwKDENlbYG7lXxNGFquSBEXZr9ZbCp8YKXYADPdQS", "GTycQamaBLKET6mxwzojHIa3a0Qk/f4p0jfnV7pjl+o=", Context.class), new C3445jz("StEAvb/iigDIlQhq4PghExfp73gHg8IUtO74V2AuLhqk3CKzmFDPWKX0qTLgtCrl", "a0akqO7gmy+q2qeS0xD9lQHxt87lQ1nAIIevL4sq6Y8=", new Class[0]), new C3445jz("YG+UUJxJEVSGG6jfg3qjLnMxlQFUVyMMjgzEbZMK/+kyZ0C5+m/L80+lYQbH4OQO", "6dR3aiNoBR9E5efHnflEq0hfvoZwKGjGgWyKk1r6EjY=", NetworkCapabilities.class, Long.class, Long.class), new C3445jz("4x2Hh5iTg/qW5xffP7XUVyyhNVEHgfMgXZN24VVA9KHUAzifkbImBn58u0wzbVSZ", "gKocIG5D8c3aRlaOl/4axnWoyxTZtkz2guMC88wPwLk=", String.class), new C3445jz("MB4NRPoKbszEsZs50F7mJwzu+33Ub7A+OagrfmieGdBjZs38LvzcQgcwQTLr3PB3", "U7Z7WtTc2NEgeomO+YkeOiOPYLQ8ra19osxSo/kBqLE=", View.class, Activity.class), new C3445jz("jfdrT3YDVcDOM9UB5LzDpqcbuDp5keVZHqGcg+MV5UCB23uYRRp2NQL5QwO7s7yD", "z81VgQq8DV/RpboX+za4HXvceA1wD9mZ3Lv8nuAqQVE=", DisplayMetrics.class, View.class), new C3445jz("0llJphW+1AJxnxbH/gLXWqExBUUJf0DQ3WuxUSKByDNRS1LORshIg0jq004o4mzE", "HgFzVQOFBY50xlS1g5v9F7L61Tt5netYE+jncsHeWeQ=", Long[].class, Integer.class), new C3445jz("yqnoA3qkrpGdV0UDHfD7DkNdKz4CD4Omw8LwQ+mqDfnJnY5wPxLFUyGI2UEZc+9I", "QVM5zcLU6Zl19Cag2KVJanZ3HUWi7v3pEqNBU6r5voo=", new Class[0]), new C3445jz("6uD00qi6mV8zu6AkyeC5bCv3568B2wPeNuQXCAqDKxVcHdQxA+KxNWLV41zFPdNB", "4KiYmGZMrZQiVkw5xeVvBXbdnWwWVS3sMp2EDvInOL8=", Context.class, Integer.class), new C3445jz("3At8eFbAjAqsz9p03G/poStdLmldcsHDf7hwtHq+b9glp6N8klzSrT8HZ4GJjVN5", "mjdtNA0QQNNvx7gc0+BIhw0NZpaH3AMuijVtb9zt66I=", Integer.class, Context.class, Boolean.class), new C3445jz("I4xYlccqZe8KvMWrizW1s/OekBI2YfU7UNZwq9dr0dp7B5I0B1zvHWlOnn7y8ubq", "k7BIphhpl3j5W4f9W8N9gMUD+i5xBlP2tWz8eVUQlQQ=", Context.class), new C3445jz("i8dIMUuFazx2QmSkfzNlM975x3JumPrUee1RASXGMNDJH8RWJsPNqbpEpnJFa4Hi", "5davCcWMx5wzne2F0dLFbMr5/cylOtU7FK3CcX7bJPU=", Context.class), new C3445jz("O/IhSczWkqH+q2aziu5mnePClwI2VInt8+rK2r5DAzxhVznO7DMyVuowa8d0HFxQ", "c/euB7bpmuTDKGTS9kQ/O7Lr64QuDKreUuxk5moaYNc=", MotionEvent.class, DisplayMetrics.class), new C3445jz("8cUAbwpt6SKUQHhtSwuMmdGkTrID2QvHq2LA27x2GE3ivBr88edu7HCA+XurISAj", "khOZexiJY4Vla3osCKZbCsXRCvuYnTPcWDFUfUGsZNQ=", MotionEvent.class, DisplayMetrics.class));
                AbstractC3137eE.h(i);
                return new C3391iz(context, executorService, zy, c3339hz, file, c4158xA, c3066cy.d0(), i);
        }
    }

    public C3817qt(C4117wN c4117wN, C4117wN c4117wN2, C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, C4009uN c4009uN4, C4117wN c4117wN3) {
        this.f33902b = c4117wN;
        this.f33903c = c4117wN2;
        this.f33904d = c4009uN;
        this.f33905e = c4009uN2;
        this.f33906f = c4009uN3;
        this.f33907g = c4009uN4;
        this.f33908h = c4117wN3;
    }
}
