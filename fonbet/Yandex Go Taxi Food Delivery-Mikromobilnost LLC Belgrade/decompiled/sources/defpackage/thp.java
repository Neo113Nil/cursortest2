package defpackage;

import com.yandex.go.places.impl.data.entities.network.favorites.FavoritesListResponse;
import com.yandex.go.suggest.FavoriteSuggest;
import com.yandex.go.suggest.FavoriteSuggestResponse;
import com.yandex.go.suggest.c;
import com.yandex.go.suggest.f;
import com.yandex.go.taxi.order.models.api.objects.FeedbackChoices;
import com.yandex.go.taxi.order.models.api.objects.n;
import ru.yandex.taxi.favorites.experiment.FavoritesCreateRegularAddressExperiment;
import ru.yandex.taxi.favorites.experiment.b;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackAttachments;

/* loaded from: classes13.dex */
public final /* synthetic */ class thp implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ thp(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                c cVar = FavoriteSuggest.FavoriteInfoSuggest.Companion;
                break;
            case 1:
                f fVar = FavoriteSuggestResponse.Companion;
                break;
            case 2:
                gip gipVar = FavoritesCreateRegularAddressExperiment.Companion;
                auu0 auu0Var = auu0.a;
                break;
            case 3:
                gip gipVar2 = FavoritesCreateRegularAddressExperiment.Companion;
                break;
            case 4:
                b bVar = FavoritesCreateRegularAddressExperiment.a.Companion;
                break;
            case 5:
                b bVar2 = FavoritesCreateRegularAddressExperiment.a.Companion;
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                com.yandex.go.places.impl.data.entities.network.favorites.b bVar3 = FavoritesListResponse.Companion;
                break;
            case 9:
                com.yandex.go.places.impl.data.entities.network.favorites.b bVar4 = FavoritesListResponse.Companion;
                break;
            case 10:
                imp impVar = jmp.Companion;
                break;
            case 11:
                imp impVar2 = jmp.Companion;
                break;
            case 12:
                imp impVar3 = jmp.Companion;
                break;
            case 13:
                imp impVar4 = jmp.Companion;
                break;
            case 14:
                imp impVar5 = jmp.Companion;
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                rrq rrqVar = FeedbackAttachments.Companion;
                break;
            case 22:
                rrq rrqVar2 = FeedbackAttachments.Companion;
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                n nVar = FeedbackChoices.Companion;
                break;
            case 26:
                n nVar2 = FeedbackChoices.Companion;
                break;
            case 27:
                n nVar3 = FeedbackChoices.Companion;
                break;
            case 28:
                n nVar4 = FeedbackChoices.Companion;
                break;
            default:
                n nVar5 = FeedbackChoices.Companion;
                break;
        }
        return new p53(auu0.a, 0);
    }
}
