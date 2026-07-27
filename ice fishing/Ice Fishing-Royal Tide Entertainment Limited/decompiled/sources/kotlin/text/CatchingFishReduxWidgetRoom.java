package kotlin.text;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes.dex */
public final class CatchingFishReduxWidgetRoom extends CatchingFishRealmDaggerHilt {
    @Override // kotlin.text.CatchingFishPicassoMVVM
    public final int CatchingFishCoroutine(int i) {
        return ThreadLocalRandom.current().nextInt(0, i);
    }

    @Override // kotlin.text.CatchingFishRealmDaggerHilt
    public final Random CatchingFishReduxKtor() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(current, "current(...)");
        return current;
    }
}
