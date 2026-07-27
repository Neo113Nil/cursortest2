package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.y5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4194y5 extends YM {

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ int f35094B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4194y5(String str, int i) {
        super(str);
        this.f35094B = i;
    }

    @Override // com.google.android.gms.internal.ads.YM
    public final void c(ByteBuffer byteBuffer) {
        switch (this.f35094B) {
            case 0:
                byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
                break;
        }
    }

    private final void e(ByteBuffer byteBuffer) {
    }
}
