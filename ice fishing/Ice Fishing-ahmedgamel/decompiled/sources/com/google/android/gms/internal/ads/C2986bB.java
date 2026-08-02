package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* renamed from: com.google.android.gms.internal.ads.bB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2986bB extends AbstractC3093dB {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f30029A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ Object f30030B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2986bB(com.bumptech.glide.manager.o oVar, CharSequence charSequence, Object obj, int i) {
        super(oVar, charSequence);
        this.f30029A = i;
        this.f30030B = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3093dB
    public final int a(int i) {
        switch (this.f30029A) {
            case 0:
                CharSequence charSequence = this.f30493v;
                int length = charSequence.length();
                AbstractC2792Sd.L(i, length);
                while (i < length) {
                    if (((PA) this.f30030B).b(charSequence.charAt(i))) {
                        return i;
                    }
                    i++;
                }
                return -1;
            default:
                Matcher matcher = (Matcher) ((C4201xq) this.f30030B).f35841u;
                if (matcher.find(i)) {
                    return matcher.start();
                }
                return -1;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3093dB
    public final int b(int i) {
        switch (this.f30029A) {
            case 0:
                return i + 1;
            default:
                return ((Matcher) ((C4201xq) this.f30030B).f35841u).end();
        }
    }
}
