package l8;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class E extends IOException {

    /* renamed from: n, reason: collision with root package name */
    public final EnumC4710b f39095n;

    public E(EnumC4710b enumC4710b) {
        super("stream was reset: " + enumC4710b);
        this.f39095n = enumC4710b;
    }
}
