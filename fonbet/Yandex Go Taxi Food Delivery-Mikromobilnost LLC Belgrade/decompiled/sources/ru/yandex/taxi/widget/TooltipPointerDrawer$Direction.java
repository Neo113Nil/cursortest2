package ru.yandex.taxi.widget;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"ru/yandex/taxi/widget/TooltipPointerDrawer$Direction", "", "Lru/yandex/taxi/widget/TooltipPointerDrawer$Direction;", "", "rotate", CA20Status.STATUS_USER_I, "a", "()I", JCP.RAW_PREFIX, "START", "UP", "END", "DOWN", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TooltipPointerDrawer$Direction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TooltipPointerDrawer$Direction[] $VALUES;
    public static final TooltipPointerDrawer$Direction DOWN;
    public static final TooltipPointerDrawer$Direction END;
    public static final TooltipPointerDrawer$Direction NONE;
    public static final TooltipPointerDrawer$Direction START;
    public static final TooltipPointerDrawer$Direction UP;
    private final int rotate;

    static {
        TooltipPointerDrawer$Direction tooltipPointerDrawer$Direction = new TooltipPointerDrawer$Direction(JCP.RAW_PREFIX, 0, Integer.MAX_VALUE);
        NONE = tooltipPointerDrawer$Direction;
        TooltipPointerDrawer$Direction tooltipPointerDrawer$Direction2 = new TooltipPointerDrawer$Direction("START", 1, 90);
        START = tooltipPointerDrawer$Direction2;
        TooltipPointerDrawer$Direction tooltipPointerDrawer$Direction3 = new TooltipPointerDrawer$Direction("UP", 2, SubsamplingScaleImageView.ORIENTATION_180);
        UP = tooltipPointerDrawer$Direction3;
        TooltipPointerDrawer$Direction tooltipPointerDrawer$Direction4 = new TooltipPointerDrawer$Direction("END", 3, -90);
        END = tooltipPointerDrawer$Direction4;
        TooltipPointerDrawer$Direction tooltipPointerDrawer$Direction5 = new TooltipPointerDrawer$Direction("DOWN", 4, 0);
        DOWN = tooltipPointerDrawer$Direction5;
        TooltipPointerDrawer$Direction[] tooltipPointerDrawer$DirectionArr = {tooltipPointerDrawer$Direction, tooltipPointerDrawer$Direction2, tooltipPointerDrawer$Direction3, tooltipPointerDrawer$Direction4, tooltipPointerDrawer$Direction5};
        $VALUES = tooltipPointerDrawer$DirectionArr;
        $ENTRIES = kotlin.enums.a.a(tooltipPointerDrawer$DirectionArr);
    }

    public TooltipPointerDrawer$Direction(String str, int i, int i2) {
        this.rotate = i2;
    }

    public static TooltipPointerDrawer$Direction valueOf(String str) {
        return (TooltipPointerDrawer$Direction) Enum.valueOf(TooltipPointerDrawer$Direction.class, str);
    }

    public static TooltipPointerDrawer$Direction[] values() {
        return (TooltipPointerDrawer$Direction[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getRotate() {
        return this.rotate;
    }
}
