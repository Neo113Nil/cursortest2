package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* renamed from: com.google.android.gms.internal.ads.eB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3134eB extends AbstractC3298hB {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f30330A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ Object f30331B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3134eB(com.bumptech.glide.manager.o oVar, CharSequence charSequence, Object obj, int i) {
        super(oVar, charSequence);
        this.f30330A = i;
        this.f30331B = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3298hB
    public final int a(int i) {
        switch (this.f30330A) {
            case 0:
                CharSequence charSequence = this.f31211v;
                int length = charSequence.length();
                PA.b0(i, length);
                while (i < length) {
                    if (((TA) this.f30331B).a(charSequence.charAt(i))) {
                        return i;
                    }
                    i++;
                }
                return -1;
            default:
                Matcher matcher = (Matcher) ((C2478Aq) this.f30331B).f23905u;
                if (matcher.find(i)) {
                    return matcher.start();
                }
                return -1;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3298hB
    public final int b(int i) {
        switch (this.f30330A) {
            case 0:
                return i + 1;
            default:
                return ((Matcher) ((C2478Aq) this.f30331B).f23905u).end();
        }
    }
}
