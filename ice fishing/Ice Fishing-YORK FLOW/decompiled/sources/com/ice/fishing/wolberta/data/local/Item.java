package com.ice.fishing.wolberta.data.local;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class Item {
    public static final int $stable = 0;
    private final defpackage.b50 heat;
    private final java.lang.String icon;
    private final int id;
    private final boolean marked;
    private final java.lang.String name;
    private final int score;
    private final defpackage.dh1 style;
    private final java.lang.String time;
    private final defpackage.mq1 type;
    private final boolean veggie;

    public Item(int i, java.lang.String str, boolean z, defpackage.mq1 mq1Var, java.lang.String str2, defpackage.b50 b50Var, boolean z2, java.lang.String str3, int i2, defpackage.dh1 dh1Var) {
        str.getClass();
        mq1Var.getClass();
        str2.getClass();
        b50Var.getClass();
        str3.getClass();
        dh1Var.getClass();
        this.id = i;
        this.name = str;
        this.marked = z;
        this.type = mq1Var;
        this.icon = str2;
        this.heat = b50Var;
        this.veggie = z2;
        this.time = str3;
        this.score = i2;
        this.style = dh1Var;
    }

    public static /* synthetic */ com.ice.fishing.wolberta.data.local.Item copy$default(com.ice.fishing.wolberta.data.local.Item item, int i, java.lang.String str, boolean z, defpackage.mq1 mq1Var, java.lang.String str2, defpackage.b50 b50Var, boolean z2, java.lang.String str3, int i2, defpackage.dh1 dh1Var, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = item.id;
        }
        if ((i3 & 2) != 0) {
            str = item.name;
        }
        if ((i3 & 4) != 0) {
            z = item.marked;
        }
        if ((i3 & 8) != 0) {
            mq1Var = item.type;
        }
        if ((i3 & 16) != 0) {
            str2 = item.icon;
        }
        if ((i3 & 32) != 0) {
            b50Var = item.heat;
        }
        if ((i3 & 64) != 0) {
            z2 = item.veggie;
        }
        if ((i3 & 128) != 0) {
            str3 = item.time;
        }
        if ((i3 & 256) != 0) {
            i2 = item.score;
        }
        if ((i3 & 512) != 0) {
            dh1Var = item.style;
        }
        int i4 = i2;
        defpackage.dh1 dh1Var2 = dh1Var;
        boolean z3 = z2;
        java.lang.String str4 = str3;
        java.lang.String str5 = str2;
        defpackage.b50 b50Var2 = b50Var;
        return item.copy(i, str, z, mq1Var, str5, b50Var2, z3, str4, i4, dh1Var2);
    }

    public final int component1() {
        return this.id;
    }

    public final defpackage.dh1 component10() {
        return this.style;
    }

    public final java.lang.String component2() {
        return this.name;
    }

    public final boolean component3() {
        return this.marked;
    }

    public final defpackage.mq1 component4() {
        return this.type;
    }

    public final java.lang.String component5() {
        return this.icon;
    }

    public final defpackage.b50 component6() {
        return this.heat;
    }

    public final boolean component7() {
        return this.veggie;
    }

    public final java.lang.String component8() {
        return this.time;
    }

    public final int component9() {
        return this.score;
    }

    public final com.ice.fishing.wolberta.data.local.Item copy(int i, java.lang.String str, boolean z, defpackage.mq1 mq1Var, java.lang.String str2, defpackage.b50 b50Var, boolean z2, java.lang.String str3, int i2, defpackage.dh1 dh1Var) {
        str.getClass();
        mq1Var.getClass();
        str2.getClass();
        b50Var.getClass();
        str3.getClass();
        dh1Var.getClass();
        return new com.ice.fishing.wolberta.data.local.Item(i, str, z, mq1Var, str2, b50Var, z2, str3, i2, dh1Var);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ice.fishing.wolberta.data.local.Item)) {
            return false;
        }
        com.ice.fishing.wolberta.data.local.Item item = (com.ice.fishing.wolberta.data.local.Item) obj;
        return this.id == item.id && defpackage.ma0.QiMR8OkAhezm(this.name, item.name) && this.marked == item.marked && this.type == item.type && defpackage.ma0.QiMR8OkAhezm(this.icon, item.icon) && this.heat == item.heat && this.veggie == item.veggie && defpackage.ma0.QiMR8OkAhezm(this.time, item.time) && this.score == item.score && this.style == item.style;
    }

    public final defpackage.b50 getHeat() {
        return this.heat;
    }

    public final java.lang.String getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.id;
    }

    public final boolean getMarked() {
        return this.marked;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final int getScore() {
        return this.score;
    }

    public final defpackage.dh1 getStyle() {
        return this.style;
    }

    public final java.lang.String getTime() {
        return this.time;
    }

    public final defpackage.mq1 getType() {
        return this.type;
    }

    public final boolean getVeggie() {
        return this.veggie;
    }

    public int hashCode() {
        return this.style.hashCode() + defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.score, (this.time.hashCode() + defpackage.pVQOaWB9QMo4.JhCgjQRTAOCT((this.heat.hashCode() + ((this.icon.hashCode() + ((this.type.hashCode() + defpackage.pVQOaWB9QMo4.JhCgjQRTAOCT((this.name.hashCode() + (java.lang.Integer.hashCode(this.id) * 31)) * 31, 31, this.marked)) * 31)) * 31)) * 31, 31, this.veggie)) * 31, 31);
    }

    public java.lang.String toString() {
        return "Item(id=" + this.id + ", name=" + this.name + ", marked=" + this.marked + ", type=" + this.type + ", icon=" + this.icon + ", heat=" + this.heat + ", veggie=" + this.veggie + ", time=" + this.time + ", score=" + this.score + ", style=" + this.style + ")";
    }
}
