package com.squareup.cardcustomizations.signature;

import com.squareup.cardcustomizations.signature.Point;
import java.util.List;

/* loaded from: classes5.dex */
public interface GlyphPainter {
    void addPoint(Point.Timestamped timestamped);

    void finish();

    List points();
}
