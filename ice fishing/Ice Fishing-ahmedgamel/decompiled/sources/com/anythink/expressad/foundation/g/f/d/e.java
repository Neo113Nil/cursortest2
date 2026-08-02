package com.anythink.expressad.foundation.g.f.d;

import com.anythink.expressad.foundation.g.f.j;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public abstract class e<T> extends j<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f20083c = "e";

    /* renamed from: d, reason: collision with root package name */
    private final String f20084d;

    public e(int i, String str, String str2, com.anythink.expressad.foundation.g.f.e<T> eVar) {
        super(i, str, eVar);
        this.f20084d = str2;
    }

    @Override // com.anythink.expressad.foundation.g.f.j
    public final byte[] h() {
        try {
            String str = this.f20084d;
            if (str == null) {
                return null;
            }
            return str.getBytes(com.anythink.expressad.foundation.g.a.bR);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public e(int i, String str, String str2, com.anythink.expressad.foundation.g.f.e<T> eVar, boolean z6) {
        super(i, str, eVar, z6);
        this.f20084d = str2;
    }
}
