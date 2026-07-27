package com.google.firebase.ktx;

import N3.b;
import androidx.annotation.Keep;
import com.bumptech.glide.d;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p8.g;

@Keep
/* loaded from: classes2.dex */
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        return g.k(d.g("fire-core-ktx", "21.0.0"));
    }
}
