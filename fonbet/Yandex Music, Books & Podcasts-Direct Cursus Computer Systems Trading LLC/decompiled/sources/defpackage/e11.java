package defpackage;

import com.yandex.music.screen.artist.albums.data.PagingResultAlbumsDto;
import com.yandex.music.shared.dto.PagerDto;
import com.yandex.music.shared.dto.album.AlbumDto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class e11 extends s4k {
    public final String b;
    public final mm1 c;
    public final boolean d;
    public final k11 e;
    public final k11 f;
    public final jyr g;
    public final jyr h;
    public final boolean i;
    public final int j;

    public e11(String str, mm1 mm1Var, boolean z, k11 k11Var, k11 k11Var2) {
        str.getClass();
        mm1Var.getClass();
        this.b = str;
        this.c = mm1Var;
        this.d = z;
        this.e = k11Var;
        this.f = k11Var2;
        this.g = btf.b(new zb0(15));
        l18 l18Var = l18.b;
        this.h = l18Var.b(hag.I(b11.class), true);
        bdt I = hag.I(z66.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.i = ((z66) qdcVar.C(I)).h();
        this.j = 20;
    }

    public static c11 f(PagingResultAlbumsDto pagingResultAlbumsDto) {
        Integer total;
        PagerDto pager = pagingResultAlbumsDto.getPager();
        if (pager != null && (total = pager.getTotal()) != null) {
            int intValue = total.intValue();
            List<AlbumDto> albums = pagingResultAlbumsDto.getAlbums();
            if (albums != null) {
                ArrayList arrayList = new ArrayList();
                for (AlbumDto albumDto : albums) {
                    oq G = albumDto != null ? ild.G(albumDto) : null;
                    if (G != null) {
                        arrayList.add(G);
                    }
                }
                return new c11(arrayList, intValue);
            }
        }
        return null;
    }

    @Override // defpackage.s4k
    public final Object c(t4k t4kVar) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x007c, code lost:
    
        if (r12 == r0) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fd A[Catch: IOException -> 0x0038, TryCatch #0 {IOException -> 0x0038, blocks: (B:15:0x0033, B:16:0x00b4, B:17:0x00f7, B:19:0x00fd, B:21:0x010c, B:22:0x0110, B:25:0x011a, B:26:0x0121, B:30:0x0045, B:31:0x00d7, B:33:0x004c, B:34:0x00f5, B:46:0x008b, B:51:0x0099, B:54:0x00b7, B:55:0x00bc, B:56:0x00bd, B:60:0x00da), top: B:8:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011a A[Catch: IOException -> 0x0038, TryCatch #0 {IOException -> 0x0038, blocks: (B:15:0x0033, B:16:0x00b4, B:17:0x00f7, B:19:0x00fd, B:21:0x010c, B:22:0x0110, B:25:0x011a, B:26:0x0121, B:30:0x0045, B:31:0x00d7, B:33:0x004c, B:34:0x00f5, B:46:0x008b, B:51:0x0099, B:54:0x00b7, B:55:0x00bc, B:56:0x00bd, B:60:0x00da), top: B:8:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0055  */
    @Override // defpackage.s4k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(o4k o4kVar, cg6 cg6Var) {
        d11 d11Var;
        int i;
        int i2;
        PagingResultAlbumsDto pagingResultAlbumsDto;
        c11 f;
        try {
            if (cg6Var instanceof d11) {
                d11Var = (d11) cg6Var;
                int i3 = d11Var.m;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    d11Var.m = i3 - Integer.MIN_VALUE;
                    d11 d11Var2 = d11Var;
                    Object obj = d11Var2.k;
                    nm6 nm6Var = nm6.a;
                    i = d11Var2.m;
                    k11 k11Var = this.e;
                    if (i != 0) {
                        qgg.h0(obj);
                        Integer num = (Integer) o4kVar.a();
                        int intValue = num != null ? num.intValue() : 0;
                        if (this.i) {
                            b11 b11Var = (b11) this.h.getValue();
                            d11Var2.j = intValue;
                            d11Var2.m = 1;
                            obj = b11Var.a(this.b, d11Var2);
                        } else {
                            int ordinal = this.c.ordinal();
                            jyr jyrVar = this.g;
                            if (ordinal == 0) {
                                int i4 = intValue;
                                g11 g11Var = (g11) jyrVar.getValue();
                                String str = this.b;
                                int i5 = this.j;
                                boolean z = this.d;
                                d11Var2.j = i4;
                                d11Var2.m = 2;
                                obj = g11Var.G(str, i4, i5, z, d11Var2);
                                if (obj != nm6Var) {
                                    i2 = i4;
                                    pagingResultAlbumsDto = (PagingResultAlbumsDto) obj;
                                }
                            } else if (ordinal == 1) {
                                g11 g11Var2 = (g11) jyrVar.getValue();
                                String str2 = this.b;
                                int i6 = this.j;
                                boolean z2 = this.d;
                                d11Var2.j = intValue;
                                d11Var2.m = 3;
                                int i7 = intValue;
                                obj = g11Var2.P(str2, i7, i6, z2, d11Var2);
                                if (obj != nm6Var) {
                                    i2 = i7;
                                    pagingResultAlbumsDto = (PagingResultAlbumsDto) obj;
                                }
                            } else {
                                if (ordinal != 2) {
                                    throw new x7j();
                                }
                                g11 g11Var3 = (g11) jyrVar.getValue();
                                String str3 = this.b;
                                int i8 = this.j;
                                boolean z3 = this.d;
                                d11Var2.j = intValue;
                                d11Var2.m = 4;
                                int i9 = intValue;
                                obj = g11Var3.k(str3, i9, i8, z3, d11Var2);
                                i2 = i9;
                                if (obj == nm6Var) {
                                }
                                pagingResultAlbumsDto = (PagingResultAlbumsDto) obj;
                            }
                        }
                        return nm6Var;
                    }
                    if (i == 1) {
                        qgg.h0(obj);
                        k11Var.invoke();
                        return new q4k((List) obj, null);
                    }
                    if (i == 2) {
                        i2 = d11Var2.j;
                        qgg.h0(obj);
                        pagingResultAlbumsDto = (PagingResultAlbumsDto) obj;
                    } else if (i == 3) {
                        i2 = d11Var2.j;
                        qgg.h0(obj);
                        pagingResultAlbumsDto = (PagingResultAlbumsDto) obj;
                    } else {
                        if (i != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = d11Var2.j;
                        qgg.h0(obj);
                        pagingResultAlbumsDto = (PagingResultAlbumsDto) obj;
                    }
                    f = f(pagingResultAlbumsDto);
                    if (f != null) {
                        throw new IOException("parse error");
                    }
                    k11Var.invoke();
                    int i10 = i2 + 1;
                    return new q4k(f.a, null, this.j * i10 < f.b ? Integer.valueOf(i10) : null, Integer.MIN_VALUE, Integer.MIN_VALUE);
                }
            }
            if (i != 0) {
            }
            f = f(pagingResultAlbumsDto);
            if (f != null) {
            }
        } catch (IOException e) {
            this.f.invoke();
            return new p4k(e);
        }
        d11Var = new d11(this, cg6Var);
        d11 d11Var22 = d11Var;
        Object obj2 = d11Var22.k;
        nm6 nm6Var2 = nm6.a;
        i = d11Var22.m;
        k11 k11Var2 = this.e;
    }
}
