package com.squareup.cash.data.profile.documents;

import com.squareup.protos.document.DocumentCategoryEntity;
import okio.Path;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class RealDocumentsManager$documents$1$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[DocumentCategoryEntity.RenderStyle.values().length];
        try {
            Path.Companion companion = DocumentCategoryEntity.RenderStyle.Companion;
            iArr[3] = 1;
        } catch (NoSuchFieldError unused) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
