package com.anythink.expressad.foundation.g.f.d;

import com.anythink.expressad.foundation.g.f.j;
import com.anythink.expressad.foundation.g.f.l;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public class g extends j<String> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f19302c = "g";

    /* renamed from: d, reason: collision with root package name */
    private String f19303d;

    public g(int i, String str, String str2, com.anythink.expressad.foundation.g.f.e<String> eVar) {
        super(i, str, eVar);
        this.f19303d = str2;
    }

    @Override // com.anythink.expressad.foundation.g.f.j
    public final l<String> a(com.anythink.expressad.foundation.g.f.f.c cVar) {
        try {
            return l.a(new String(cVar.f19320b, com.anythink.expressad.foundation.g.f.g.d.a(cVar.f19322d)), cVar);
        } catch (UnsupportedEncodingException e9) {
            e9.getMessage();
            return l.a(new com.anythink.expressad.foundation.g.f.a.a(8, cVar));
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.j
    public final byte[] h() {
        try {
            String str = this.f19303d;
            if (str == null) {
                return null;
            }
            return str.getBytes(com.anythink.expressad.foundation.g.a.bR);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
