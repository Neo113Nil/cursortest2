package com.combinations.level.experts.core.domain.model;

import defpackage.h90;
import defpackage.o30;
import defpackage.q20;
import defpackage.wj;
import defpackage.x20;
import defpackage.yp;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class GameProgress {
    public static final int STARTING_HINTS = 5;
    private final int hints;
    private final Map<Integer, LevelResult> results;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ GameProgress(Map map, int i, int i2, wj wjVar) {
        this((i2 & 1) != 0 ? yp.OOA6hdeuvCS : map, (i2 & 2) != 0 ? 5 : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GameProgress copy$default(GameProgress gameProgress, Map map, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = gameProgress.results;
        }
        if ((i2 & 2) != 0) {
            i = gameProgress.hints;
        }
        return gameProgress.copy(map, i);
    }

    public final Map<Integer, LevelResult> component1() {
        return this.results;
    }

    public final int component2() {
        return this.hints;
    }

    public final GameProgress copy(Map<Integer, LevelResult> map, int i) {
        map.getClass();
        return new GameProgress(map, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameProgress)) {
            return false;
        }
        GameProgress gameProgress = (GameProgress) obj;
        return o30.rQPn8YBR(this.results, gameProgress.results) && this.hints == gameProgress.hints;
    }

    public final int getCompletedCount() {
        Set<Integer> keySet = this.results.keySet();
        int i = 0;
        if ((keySet instanceof Collection) && keySet.isEmpty()) {
            return 0;
        }
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            if (intValue >= 0 && intValue <= h90.Yi7zF1RB1 - 1 && (i = i + 1) < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i;
    }

    public final int getHints() {
        return this.hints;
    }

    public final int getMaxStars() {
        List list = h90.GWasM1elztuh;
        return h90.Yi7zF1RB1 * 3;
    }

    public final int getNextLevel() {
        Object obj;
        List list = h90.GWasM1elztuh;
        Iterator it = new x20(0, h90.Yi7zF1RB1 - 1, 1).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (this.results.get(Integer.valueOf(((Number) obj).intValue())) == null) {
                break;
            }
        }
        Integer num = (Integer) obj;
        if (num != null) {
            return num.intValue();
        }
        List list2 = h90.GWasM1elztuh;
        return h90.Yi7zF1RB1 - 1;
    }

    public final Map<Integer, LevelResult> getResults() {
        return this.results;
    }

    public final int getTotalStars() {
        Iterator<T> it = this.results.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((LevelResult) it.next()).getStars();
        }
        return i;
    }

    public int hashCode() {
        return Integer.hashCode(this.hints) + (this.results.hashCode() * 31);
    }

    public final boolean isCampaignComplete() {
        int completedCount = getCompletedCount();
        List list = h90.GWasM1elztuh;
        return completedCount > h90.Yi7zF1RB1 - 1;
    }

    public final boolean isUnlocked(int i) {
        return i <= getNextLevel();
    }

    public final LevelResult resultFor(int i) {
        return this.results.get(Integer.valueOf(i));
    }

    public final int starsInSector(Sector sector) {
        sector.getClass();
        Iterator it = new x20(sector.getFirstLevel(), sector.getLastLevel(), 1).iterator();
        int i = 0;
        while (it.hasNext()) {
            LevelResult levelResult = this.results.get(Integer.valueOf(((q20) it).nextInt()));
            i += levelResult != null ? levelResult.getStars() : 0;
        }
        return i;
    }

    public String toString() {
        return "GameProgress(results=" + this.results + ", hints=" + this.hints + ")";
    }

    /* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
    public static final class Companion {
        public /* synthetic */ Companion(wj wjVar) {
            this();
        }

        private Companion() {
        }
    }

    public GameProgress(Map<Integer, LevelResult> map, int i) {
        map.getClass();
        this.results = map;
        this.hints = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GameProgress() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }
}
