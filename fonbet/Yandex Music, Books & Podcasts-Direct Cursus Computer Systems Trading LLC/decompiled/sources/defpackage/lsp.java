package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class lsp implements msp {
    public static final hil b;
    public static final lsp c;
    public static final lsp d;
    public static final lsp e;
    public static final lsp f;
    public static final lsp g;
    public static final lsp h;
    public static final lsp i;
    public static final lsp j;
    public static final /* synthetic */ lsp[] k;
    public static final /* synthetic */ rdb l;
    public final ksp a;

    static {
        lsp lspVar = new lsp("TOGGLE_OFFLINE", 0, ksp.b);
        c = lspVar;
        ksp kspVar = ksp.c;
        lsp lspVar2 = new lsp("TOGGLE_CROSSFADE", 1, kspVar);
        d = lspVar2;
        lsp lspVar3 = new lsp("TOGGLE_VIDEO_COVERS", 2, kspVar);
        e = lspVar3;
        lsp lspVar4 = new lsp("TOGGLE_WAVE_SHAKE", 3, kspVar);
        f = lspVar4;
        ksp kspVar2 = ksp.d;
        lsp lspVar5 = new lsp("TOGGLE_KIDS_TAB", 4, kspVar2);
        g = lspVar5;
        lsp lspVar6 = new lsp("TOGGLE_EXPLICIT_FILTER", 5, kspVar2);
        h = lspVar6;
        lsp lspVar7 = new lsp("TOGGLE_PLAYLIST_ADD_TRACKS", 6, ksp.f);
        i = lspVar7;
        lsp lspVar8 = new lsp("TOGGLE_NOTIFY_WHATS_NEW", 7, ksp.g);
        j = lspVar8;
        lsp[] lspVarArr = {lspVar, lspVar2, lspVar3, lspVar4, lspVar5, lspVar6, lspVar7, lspVar8};
        k = lspVarArr;
        l = new rdb(lspVarArr);
        b = new hil();
    }

    public lsp(String str, int i2, ksp kspVar) {
        this.a = kspVar;
    }

    public static lsp valueOf(String str) {
        return (lsp) Enum.valueOf(lsp.class, str);
    }

    public static lsp[] values() {
        return (lsp[]) k.clone();
    }

    @Override // defpackage.msp
    public final ksp a() {
        return this.a;
    }
}
