package defpackage;

import com.yandex.go.vault.flexsdk.shared.VaultPaletteDto;
import kotlinx.serialization.json.b;

/* loaded from: classes14.dex */
public final class r331 extends fnr0 {
    public final wnt a;
    public final i331 b;
    public final String c;
    public final String d;

    public r331(wnt wntVar, i331 i331Var) {
        super(0);
        this.a = wntVar;
        this.b = i331Var;
        this.c = "ui_palette";
        this.d = "VaultSharedDataParser";
    }

    @Override // defpackage.fnr0
    public final String getJsonKey() {
        return this.c;
    }

    @Override // defpackage.fnr0
    public final String getSharedDataParserType() {
        return this.d;
    }

    @Override // defpackage.fnr0
    public final bnr0 tryParse(sbx sbxVar, b bVar) {
        try {
            VaultPaletteDto vaultPaletteDto = (VaultPaletteDto) ((xnt) this.a).c(bVar.toString(), VaultPaletteDto.Companion.serializer());
            i331 i331Var = this.b;
            i331Var.c = vaultPaletteDto;
            i331Var.b.edit().putString("main_screen_skeleton_shimmer_color", vaultPaletteDto.e).putString("main_screen_first_gradient_color", vaultPaletteDto.c).putString("main_screen_second_gradient_color", vaultPaletteDto.d).apply();
            return null;
        } catch (Throwable th) {
            jst.e.j(th);
            return null;
        }
    }
}
