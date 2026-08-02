package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.domainitem.ContentRestrictionsDto;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import com.yandex.music.shared.player.screen.skeleton.blocks.data.nonmusic.book.AboutBookArtistDto;
import com.yandex.music.shared.player.screen.skeleton.blocks.data.nonmusic.book.AboutBookDto;
import com.yandex.music.shared.player.screen.skeleton.blocks.data.nonmusic.book.AboutBookPlayerBlockApi;
import com.yandex.music.shared.player.screen.skeleton.blocks.data.nonmusic.podcast.AboutPodcastDto;
import com.yandex.music.shared.player.screen.skeleton.blocks.data.nonmusic.podcast.AboutPodcastPlayerBlockApi;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import ru.yandex.music.data.audio.Album$AlbumType;
import ru.yandex.music.data.audio.WarningContent;

/* loaded from: classes4.dex */
public final class y2 {
    public final /* synthetic */ int a;
    public final jyr b;

    public y2(e0j e0jVar, int i) {
        this.a = i;
        e0jVar.getClass();
        switch (i) {
            case 1:
                this.b = btf.b(new w2(e0jVar, 2));
                break;
            default:
                this.b = btf.b(new w2(e0jVar, 0));
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        x2 x2Var;
        int i;
        bii biiVar;
        r2 r2Var;
        u9b V;
        String description;
        String title;
        List<AboutBookArtistDto> artists;
        WarningContent warningContent;
        r4 r4Var;
        int i2;
        bii biiVar2;
        p4 p4Var;
        u9b V2;
        String description2;
        Integer likesCount;
        WarningContent warningContent2;
        switch (this.a) {
            case 0:
                if (cg6Var instanceof x2) {
                    x2Var = (x2) cg6Var;
                    int i3 = x2Var.m;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        x2Var.m = i3 - Integer.MIN_VALUE;
                        Object obj = x2Var.k;
                        nm6 nm6Var = nm6.a;
                        i = x2Var.m;
                        if (i != 0) {
                            qgg.h0(obj);
                            Call<MusicBackendResponse<AboutBookDto>> a = ((AboutBookPlayerBlockApi) this.b.getValue()).a(str);
                            x2Var.j = str;
                            x2Var.m = 1;
                            obj = swf.N(a, x2Var);
                            if (obj == nm6Var) {
                                return nm6Var;
                            }
                        } else {
                            if (i != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str = x2Var.j;
                            qgg.h0(obj);
                        }
                        String str2 = str;
                        biiVar = (bii) obj;
                        if (biiVar instanceof aii) {
                            if (!(biiVar instanceof xhi)) {
                                if (biiVar instanceof yhi) {
                                    yhi yhiVar = (yhi) biiVar;
                                    return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                                }
                                if (biiVar instanceof zhi) {
                                    return uwf.J((zhi) biiVar);
                                }
                                b6e.s();
                                return null;
                            }
                            xhi xhiVar = (xhi) biiVar;
                            MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                            int i4 = xhiVar.b;
                            String name = musicBackendInvocationError.getName();
                            if (name == null) {
                                name = "";
                            }
                            String message = musicBackendInvocationError.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            return new kj6(i4, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
                        }
                        AboutBookDto aboutBookDto = (AboutBookDto) ((aii) biiVar).a;
                        aboutBookDto.getClass();
                        str2.getClass();
                        EntityCoverDto cover = aboutBookDto.getCover();
                        if (cover != null && (V = c3x.V(cover)) != null && (description = aboutBookDto.getDescription()) != null && (title = aboutBookDto.getTitle()) != null && (artists = aboutBookDto.getArtists()) != null) {
                            ArrayList arrayList = new ArrayList();
                            for (AboutBookArtistDto aboutBookArtistDto : artists) {
                                String name2 = aboutBookArtistDto != null ? aboutBookArtistDto.getName() : null;
                                if (name2 != null) {
                                    arrayList.add(name2);
                                }
                            }
                            ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
                            if (arrayList2 != null) {
                                Album$AlbumType album$AlbumType = Album$AlbumType.AUDIOBOOK;
                                ContentRestrictionsDto contentRestrictions = aboutBookDto.getContentRestrictions();
                                gd6 F = contentRestrictions != null ? lxe.F(contentRestrictions) : null;
                                String contentWarning = aboutBookDto.getContentWarning();
                                if (contentWarning == null || (warningContent = WarningContent.a(contentWarning)) == null) {
                                    warningContent = WarningContent.NONE;
                                }
                                r2Var = new r2(new lt(str2, album$AlbumType, title, warningContent, V, F), description, arrayList2);
                                return r2Var != null ? new nj6(null) : new qj6(r2Var);
                            }
                        }
                        r2Var = null;
                        if (r2Var != null) {
                        }
                    }
                }
                x2Var = new x2(this, cg6Var);
                Object obj2 = x2Var.k;
                nm6 nm6Var2 = nm6.a;
                i = x2Var.m;
                if (i != 0) {
                }
                String str22 = str;
                biiVar = (bii) obj2;
                if (biiVar instanceof aii) {
                }
                break;
            default:
                if (cg6Var instanceof r4) {
                    r4Var = (r4) cg6Var;
                    int i5 = r4Var.m;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        r4Var.m = i5 - Integer.MIN_VALUE;
                        Object obj3 = r4Var.k;
                        nm6 nm6Var3 = nm6.a;
                        i2 = r4Var.m;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            Call<MusicBackendResponse<AboutPodcastDto>> a2 = ((AboutPodcastPlayerBlockApi) this.b.getValue()).a(str);
                            r4Var.j = str;
                            r4Var.m = 1;
                            obj3 = swf.N(a2, r4Var);
                            if (obj3 == nm6Var3) {
                                return nm6Var3;
                            }
                        } else {
                            if (i2 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str = r4Var.j;
                            qgg.h0(obj3);
                        }
                        String str3 = str;
                        biiVar2 = (bii) obj3;
                        if (biiVar2 instanceof aii) {
                            if (!(biiVar2 instanceof xhi)) {
                                if (biiVar2 instanceof yhi) {
                                    yhi yhiVar2 = (yhi) biiVar2;
                                    return new lj6(yhiVar2.b, yhiVar2.c, yhiVar2.a);
                                }
                                if (biiVar2 instanceof zhi) {
                                    return uwf.J((zhi) biiVar2);
                                }
                                b6e.s();
                                return null;
                            }
                            xhi xhiVar2 = (xhi) biiVar2;
                            MusicBackendInvocationError musicBackendInvocationError2 = xhiVar2.c;
                            int i6 = xhiVar2.b;
                            String name3 = musicBackendInvocationError2.getName();
                            if (name3 == null) {
                                name3 = "";
                            }
                            String message2 = musicBackendInvocationError2.getMessage();
                            if (message2 == null) {
                                message2 = "";
                            }
                            return new kj6(i6, musicBackendInvocationError2.getDetails(), name3, message2, xhiVar2.a);
                        }
                        AboutPodcastDto aboutPodcastDto = (AboutPodcastDto) ((aii) biiVar2).a;
                        aboutPodcastDto.getClass();
                        str3.getClass();
                        EntityCoverDto cover2 = aboutPodcastDto.getCover();
                        if (cover2 != null && (V2 = c3x.V(cover2)) != null && (description2 = aboutPodcastDto.getDescription()) != null && (likesCount = aboutPodcastDto.getLikesCount()) != null) {
                            int intValue = likesCount.intValue();
                            String title2 = aboutPodcastDto.getTitle();
                            if (title2 != null) {
                                Album$AlbumType album$AlbumType2 = Album$AlbumType.PODCAST;
                                ContentRestrictionsDto contentRestrictions2 = aboutPodcastDto.getContentRestrictions();
                                gd6 F2 = contentRestrictions2 != null ? lxe.F(contentRestrictions2) : null;
                                String contentWarning2 = aboutPodcastDto.getContentWarning();
                                if (contentWarning2 == null || (warningContent2 = WarningContent.a(contentWarning2)) == null) {
                                    warningContent2 = WarningContent.NONE;
                                }
                                p4Var = new p4(new lt(str3, album$AlbumType2, title2, warningContent2, V2, F2), intValue, description2);
                                return p4Var != null ? new nj6(null) : new qj6(p4Var);
                            }
                        }
                        p4Var = null;
                        if (p4Var != null) {
                        }
                    }
                }
                r4Var = new r4(this, cg6Var);
                Object obj32 = r4Var.k;
                nm6 nm6Var32 = nm6.a;
                i2 = r4Var.m;
                if (i2 != 0) {
                }
                String str32 = str;
                biiVar2 = (bii) obj32;
                if (biiVar2 instanceof aii) {
                }
                break;
        }
    }
}
