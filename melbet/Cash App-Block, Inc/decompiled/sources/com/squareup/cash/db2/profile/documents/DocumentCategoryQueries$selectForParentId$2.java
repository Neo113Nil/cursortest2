package com.squareup.cash.db2.profile.documents;

import com.squareup.protos.document.DocumentCategoryEntity;
import com.squareup.protos.document.VersionData;
import java.io.Serializable;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class DocumentCategoryQueries$selectForParentId$2 extends FunctionReferenceImpl implements Function8 {
    public static final DocumentCategoryQueries$selectForParentId$2 INSTANCE = new DocumentCategoryQueries$selectForParentId$2(8, DocumentCategory.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Lcom/squareup/protos/document/DocumentCategoryEntity$RenderStyle;Lcom/squareup/protos/document/VersionData;)V", 0);

    @Override // kotlin.jvm.functions.Function8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Serializable serializable) {
        String str = (String) obj;
        String str2 = (String) obj2;
        String str3 = (String) obj3;
        String str4 = (String) obj4;
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new DocumentCategory(str, str2, str3, str4, (Integer) obj5, (Long) obj6, (DocumentCategoryEntity.RenderStyle) obj7, (VersionData) serializable);
    }
}
