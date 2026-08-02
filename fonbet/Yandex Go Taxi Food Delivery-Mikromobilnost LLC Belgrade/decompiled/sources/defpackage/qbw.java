package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityCommentSuggestSelectorDto;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes14.dex */
public final class qbw extends ad5 {
    public final LinkedHashSet A;
    public final i4u x;
    public final pbw y;
    public final a z;

    public qbw(i4u i4uVar, pbw pbwVar, a aVar) {
        super(obw.class);
        this.x = i4uVar;
        this.y = pbwVar;
        this.z = aVar;
        this.A = new LinkedHashSet();
        for (IntercityCommentSuggestSelectorDto.SuggestItemDto suggestItemDto : pbwVar.c) {
            if (evu0.y(this.y.b, suggestItemDto.a, true)) {
                this.A.add(suggestItemDto.a);
            }
        }
    }

    public final sbw Kg() {
        pbw pbwVar = this.y;
        List<IntercityCommentSuggestSelectorDto.SuggestItemDto> list = pbwVar.c;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (IntercityCommentSuggestSelectorDto.SuggestItemDto suggestItemDto : list) {
            String str = suggestItemDto.a;
            arrayList.add(new nbw(str, suggestItemDto.b, this.A.contains(str)));
        }
        return new sbw(pbwVar.a, arrayList);
    }
}
