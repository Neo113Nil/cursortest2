package com.squareup.cash.graphics.swampgl.components;

import com.squareup.cash.graphics.swampgl.components.Material;

/* loaded from: classes6.dex */
public interface MaterialPlugin {
    void bindCustomUniforms(RealUniformBinder realUniformBinder);

    void dispose();

    Material.ProgramSource getProgramSource();

    void prepareMaterialInput(MaterialInput materialInput);
}
