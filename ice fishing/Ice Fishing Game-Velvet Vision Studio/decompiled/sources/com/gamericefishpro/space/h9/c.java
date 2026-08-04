package com.gamericefishpro.space.h9;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends e {
    public final transient e i;

    public c(e eVar) {
        this.i = eVar;
    }

    @Override // com.gamericefishpro.space.h9.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.i.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        e eVar = this.i;
        com.gamericefishpro.space.a.a.J(i, eVar.size());
        return eVar.get((eVar.size() - 1) - i);
    }

    @Override // com.gamericefishpro.space.h9.e
    public final e h() {
        return this.i;
    }

    @Override // com.gamericefishpro.space.h9.e, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final e subList(int i, int i2) {
        e eVar = this.i;
        com.gamericefishpro.space.a.a.K(i, i2, eVar.size());
        return eVar.subList(eVar.size() - i2, eVar.size() - i).h();
    }

    @Override // com.gamericefishpro.space.h9.e, java.util.List
    public final int indexOf(Object obj) {
        e eVar = this.i;
        int iLastIndexOf = eVar.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (eVar.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // com.gamericefishpro.space.h9.e, java.util.List
    public final int lastIndexOf(Object obj) {
        e eVar = this.i;
        int iIndexOf = eVar.indexOf(obj);
        if (iIndexOf >= 0) {
            return (eVar.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i.size();
    }
}
