package ru.yandex.video.m3.preload_manager;

import defpackage.uif;
import defpackage.xbu;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.preload_manager.PreloadException;

/* loaded from: classes6.dex */
public final class c extends uif implements Function1 {
    public final /* synthetic */ VideoData r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(VideoData videoData, PreloadException.ApiCallError apiCallError) {
        super(1);
        this.r = videoData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((xbu) obj).getClass();
        return Unit.a;
    }
}
