package ru.yandex.video.m3.annotation;

import defpackage.r1j0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.DeprecationLevel;
import kotlin.Metadata;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\nR\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/annotation/PlayerDeprecated;", "", "", Constants.KEY_MESSAGE, "Lr1j0;", "replaceWith", "Lkotlin/DeprecationLevel;", "level", "<init>", "(Ljava/lang/String;Lr1j0;Lkotlin/DeprecationLevel;)V", "()Ljava/lang/String;", "()Lr1j0;", "()Lkotlin/DeprecationLevel;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public @interface PlayerDeprecated {
    DeprecationLevel level() default DeprecationLevel.WARNING;

    String message();

    r1j0 replaceWith() default @r1j0(expression = "", imports = {});
}
