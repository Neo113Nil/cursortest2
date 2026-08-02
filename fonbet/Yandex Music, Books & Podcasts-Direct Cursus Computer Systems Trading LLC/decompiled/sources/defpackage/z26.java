package defpackage;

import com.yandex.music.shared.skeleton.blocks.simpleplaylist.SimplePlaylistBlockApi;
import com.yandex.music.skeleton.blocks.concerts.data.ConcertsBlockApi;
import com.yandex.music.skeleton.blocks.donations.data.DonationsBlockApi;
import com.yandex.music.skeleton.blocks.search_history.data.SearchHistoryBlockApi;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class z26 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ upq b;

    public /* synthetic */ z26(upq upqVar, int i) {
        this.a = i;
        this.b = upqVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (ConcertsBlockApi) this.b.c().a.b(ConcertsBlockApi.class);
            case 1:
                return (DonationsBlockApi) this.b.c().a.b(DonationsBlockApi.class);
            case 2:
                return (SearchHistoryBlockApi) this.b.c().a.b(SearchHistoryBlockApi.class);
            case 3:
                return (SimplePlaylistBlockApi) this.b.c().a.b(SimplePlaylistBlockApi.class);
            case 4:
                return new vpq(this.b.f);
            default:
                upq upqVar = this.b;
                return upq.b(upqVar, upqVar.b, null, 2);
        }
    }
}
