package com.gamericefishpro.space.jb;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements com.gamericefishpro.space.gb.g {
    public boolean a = false;
    public boolean b = false;
    public com.gamericefishpro.space.gb.c c;
    public final f d;

    public h(f fVar) {
        this.d = fVar;
    }

    @Override // com.gamericefishpro.space.gb.g
    public final com.gamericefishpro.space.gb.g b(String str) {
        if (this.a) {
            throw new com.gamericefishpro.space.gb.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.c(this.c, str, this.b);
        return this;
    }

    @Override // com.gamericefishpro.space.gb.g
    public final com.gamericefishpro.space.gb.g c(boolean z) {
        if (this.a) {
            throw new com.gamericefishpro.space.gb.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.b(this.c, z ? 1 : 0, this.b);
        return this;
    }
}
