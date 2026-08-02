package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.qdb;
import defpackage.rdb;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class E8 {
    public static final /* synthetic */ E8[] b;
    public static final /* synthetic */ qdb c;

    @NotNull
    public final String a;

    static {
        E8[] e8Arr = {new E8("OttKp", 0, "ott-kp"), new E8("Kp", 1, "kp"), new E8("OttMobile", 2, "ott-mobile"), new E8("OttSmart", 3, "ott-smart"), new E8("YaTvAndroid", 4, "ya-tv-android"), new E8("YaModule", 5, "ya-module"), new E8("YaStation", 6, "ya-station"), new E8("YaVideo", 7, "ya-video"), new E8("YaSerp", 8, "ya-serp"), new E8("YaAuto", 9, "ya-auto"), new E8("YaMusic", 10, "ya-music"), new E8("YangoMoviesSmartTv", 11, "yango-movies-smart-tv"), new E8("YangoMoviesAndroidTv", 12, "yango-movies-android-tv"), new E8("YangoMoviesAndroidMobile", 13, "yango-movies-android-mobile"), new E8("YangoMoviesIos", 14, "yango-movies-ios"), new E8("YangoMoviesWeb", 15, "yango-movies-web"), new E8("YangoMoviesTvos", 16, "yango-movies-tvos"), new E8("YangoMoviesVisionos", 17, "yango-movies-visionos")};
        b = e8Arr;
        c = new rdb(e8Arr);
    }

    public E8(String str, int i, String str2) {
        this.a = str2;
    }

    public static E8 valueOf(String str) {
        return (E8) Enum.valueOf(E8.class, str);
    }

    public static E8[] values() {
        return (E8[]) b.clone();
    }
}
