package com.miteksystems.misnap.camera.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d {
    public static final /* synthetic */ d c;
    public static final /* synthetic */ d d;
    public static final /* synthetic */ d e;
    public static final /* synthetic */ d f;
    public static final /* synthetic */ d h;
    public static final /* synthetic */ d[] i;

    static {
        d dVar = new d("LIMITED", 0);
        c = dVar;
        d dVar2 = new d("FULL", 1);
        d = dVar2;
        d dVar3 = new d("LEGACY", 2);
        e = dVar3;
        d dVar4 = new d("LEVEL_3", 3);
        f = dVar4;
        d dVar5 = new d("EXTERNAL", 4);
        d dVar6 = new d("UNDEFINED", 5);
        h = dVar6;
        i = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) i.clone();
    }
}
