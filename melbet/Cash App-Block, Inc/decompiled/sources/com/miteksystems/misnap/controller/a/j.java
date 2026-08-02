package com.miteksystems.misnap.controller.a;

import com.miteksystems.misnap.core.DocumentClassification;
import com.miteksystems.misnap.core.DocumentExtraction;
import com.miteksystems.misnap.core.UserAction;
import com.miteksystems.misnap.document.MiSnapDocumentAnalyzer$Result$Processed;
import java.util.List;

/* loaded from: classes4.dex */
public final class j extends b0 {
    public final MiSnapDocumentAnalyzer$Result$Processed.DocumentIqasResult b;
    public final List c;
    public final int[][] d;
    public final int[][] e;
    public final DocumentExtraction f;
    public final DocumentClassification g;
    public final boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(UserAction userAction, MiSnapDocumentAnalyzer$Result$Processed.DocumentIqasResult documentIqasResult, List list, int[][] iArr, int[][] iArr2, DocumentExtraction documentExtraction, DocumentClassification documentClassification, boolean z) {
        super(userAction);
        userAction.getClass();
        list.getClass();
        iArr.getClass();
        iArr2.getClass();
        this.b = documentIqasResult;
        this.c = list;
        this.d = iArr;
        this.e = iArr2;
        this.f = documentExtraction;
        this.g = documentClassification;
        this.h = z;
    }

    public j(UserAction userAction, MiSnapDocumentAnalyzer$Result$Processed.DocumentIqasResult documentIqasResult, List list, int[][] iArr, int[][] iArr2, DocumentExtraction documentExtraction, boolean z, int i) {
        this(userAction, documentIqasResult, list, iArr, iArr2, (i & 32) != 0 ? null : documentExtraction, (DocumentClassification) null, z);
    }
}
