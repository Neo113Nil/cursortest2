package com.combinations.level.experts.core.domain.model;

import defpackage.mr0;
import defpackage.o30;
import defpackage.o4;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class Puzzle {
    public static final int $stable = 8;
    private final int coreIndex;
    private final int height;
    private final int par;
    private final List<Integer> solution;
    private final List<Integer> start;
    private final int width;

    public Puzzle(int i, int i2, List<Integer> list, List<Integer> list2, int i3, int i4) {
        list.getClass();
        list2.getClass();
        this.width = i;
        this.height = i2;
        this.start = list;
        this.solution = list2;
        this.coreIndex = i3;
        this.par = i4;
        if (list.size() == getCellCount() && list2.size() == getCellCount()) {
            int cellCount = getCellCount();
            if (i3 < 0 || i3 >= cellCount) {
                o4.mE4lRynR("Core must sit inside the grid");
                throw null;
            }
            return;
        }
        throw new IllegalArgumentException(("Tile arrays must cover every cell of the " + i + "x" + i2 + " grid").toString());
    }

    public static /* synthetic */ Puzzle copy$default(Puzzle puzzle, int i, int i2, List list, List list2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = puzzle.width;
        }
        if ((i5 & 2) != 0) {
            i2 = puzzle.height;
        }
        if ((i5 & 4) != 0) {
            list = puzzle.start;
        }
        if ((i5 & 8) != 0) {
            list2 = puzzle.solution;
        }
        if ((i5 & 16) != 0) {
            i3 = puzzle.coreIndex;
        }
        if ((i5 & 32) != 0) {
            i4 = puzzle.par;
        }
        int i6 = i3;
        int i7 = i4;
        return puzzle.copy(i, i2, list, list2, i6, i7);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final List<Integer> component3() {
        return this.start;
    }

    public final List<Integer> component4() {
        return this.solution;
    }

    public final int component5() {
        return this.coreIndex;
    }

    public final int component6() {
        return this.par;
    }

    public final Puzzle copy(int i, int i2, List<Integer> list, List<Integer> list2, int i3, int i4) {
        list.getClass();
        list2.getClass();
        return new Puzzle(i, i2, list, list2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Puzzle)) {
            return false;
        }
        Puzzle puzzle = (Puzzle) obj;
        return this.width == puzzle.width && this.height == puzzle.height && o30.rQPn8YBR(this.start, puzzle.start) && o30.rQPn8YBR(this.solution, puzzle.solution) && this.coreIndex == puzzle.coreIndex && this.par == puzzle.par;
    }

    public final int getCellCount() {
        return this.width * this.height;
    }

    public final int getCoreIndex() {
        return this.coreIndex;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getPar() {
        return this.par;
    }

    public final List<Integer> getSolution() {
        return this.solution;
    }

    public final List<Integer> getStart() {
        return this.start;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.par) + mr0.Yi7zF1RB1(this.coreIndex, (this.solution.hashCode() + ((this.start.hashCode() + mr0.Yi7zF1RB1(this.height, Integer.hashCode(this.width) * 31, 31)) * 31)) * 31, 31);
    }

    public final int indexOf(int i, int i2) {
        return (i2 * this.width) + i;
    }

    public String toString() {
        return "Puzzle(width=" + this.width + ", height=" + this.height + ", start=" + this.start + ", solution=" + this.solution + ", coreIndex=" + this.coreIndex + ", par=" + this.par + ")";
    }
}
