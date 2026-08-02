package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.py41;
import defpackage.yr;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/v0;", "Lru/yandex/taxi/common_models/net/map_object/z;", "Companion", "oy41", "py41", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class v0 extends z {
    public static final py41 Companion = new py41();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final yr g;
    public final String h;

    public /* synthetic */ v0(int i, String str, String str2, String str3, String str4, boolean z, String str5, yr yrVar, String str6) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = new yr(0);
        } else {
            this.g = yrVar;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str6;
        }
    }

    @Override // ru.yandex.taxi.common_models.net.map_object.z
    public final Type a() {
        return Type.WHERE_YOU_ARE;
    }

    public v0() {
        this(null, null, null, null, 255);
    }

    public v0(String str, String str2, String str3, String str4, int i) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        str3 = (i & 8) != 0 ? "" : str3;
        str4 = (i & 32) != 0 ? "" : str4;
        yr yrVar = new yr(0);
        this.a = str;
        this.b = str2;
        this.c = "";
        this.d = str3;
        this.e = false;
        this.f = str4;
        this.g = yrVar;
        this.h = null;
    }
}
