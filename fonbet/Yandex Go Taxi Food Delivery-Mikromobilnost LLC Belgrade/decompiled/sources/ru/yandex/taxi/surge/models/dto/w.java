package ru.yandex.taxi.surge.models.dto;

import defpackage.gsq0;
import defpackage.row0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/surge/models/dto/w;", "", "Companion", "qow0", "row0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class w {
    public static final row0 Companion = new row0();
    public final String a;
    public final String b;
    public final String c;
    public final SurgeInfoItem$ActionButtonsContent d;

    public /* synthetic */ w(int i, String str, String str2, String str3, SurgeInfoItem$ActionButtonsContent surgeInfoItem$ActionButtonsContent) {
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
            this.d = new SurgeInfoItem$ActionButtonsContent(0);
        } else {
            this.d = surgeInfoItem$ActionButtonsContent;
        }
    }

    public w() {
        this(0);
    }

    public w(int i) {
        SurgeInfoItem$ActionButtonsContent surgeInfoItem$ActionButtonsContent = new SurgeInfoItem$ActionButtonsContent(0);
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = surgeInfoItem$ActionButtonsContent;
    }
}
