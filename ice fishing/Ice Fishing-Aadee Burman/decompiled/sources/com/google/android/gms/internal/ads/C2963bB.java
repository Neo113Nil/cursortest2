package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* renamed from: com.google.android.gms.internal.ads.bB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2963bB extends AbstractC3070dB {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f29241A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ Object f29242B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2963bB(com.bumptech.glide.manager.p pVar, CharSequence charSequence, Object obj, int i) {
        super(pVar, charSequence);
        this.f29241A = i;
        this.f29242B = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3070dB
    public final int a(int i) {
        switch (this.f29241A) {
            case 0:
                CharSequence charSequence = this.f29721v;
                int length = charSequence.length();
                AbstractC2772Sd.L(i, length);
                while (i < length) {
                    if (((PA) this.f29242B).b(charSequence.charAt(i))) {
                        return i;
                    }
                    i++;
                }
                return -1;
            default:
                Matcher matcher = (Matcher) ((C4178xq) this.f29242B).f35055u;
                if (matcher.find(i)) {
                    return matcher.start();
                }
                return -1;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3070dB
    public final int b(int i) {
        switch (this.f29241A) {
            case 0:
                return i + 1;
            default:
                return ((Matcher) ((C4178xq) this.f29242B).f35055u).end();
        }
    }
}
