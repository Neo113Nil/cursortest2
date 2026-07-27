package com.google.firebase.ktx;

import R3.b;
import androidx.annotation.Keep;
import com.bumptech.glide.h;
import com.google.firebase.components.ComponentRegistrar;
import d6.c;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        return c.k(h.e("fire-core-ktx", "21.0.0"));
    }
}
