package ru.yandex.taxi.vendor_api.google.face_detection;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.vendor_api.google.face_detection.GmsFaceDetectionRepository", f = "GmsFaceDetectionRepository.kt", l = {35}, m = "analyzeFaceContours", v = 2)
/* loaded from: classes6.dex */
final class GmsFaceDetectionRepository$analyzeFaceContours$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GmsFaceDetectionRepository$analyzeFaceContours$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, 0, this);
    }
}
