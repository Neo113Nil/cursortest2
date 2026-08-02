package com.squareup.cash.history.views;

import android.view.View;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.TransformingSequence;

/* loaded from: classes6.dex */
public final /* synthetic */ class ActivityItemLayout$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ActivityItemLayout f$0;

    public /* synthetic */ ActivityItemLayout$$ExternalSyntheticLambda1(ActivityItemLayout activityItemLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = activityItemLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        ActivityItemLayout activityItemLayout = this.f$0;
        switch (i) {
            case 0:
                TransformingSequence map = SequencesKt___SequencesKt.map(activityItemLayout.title, new ActivityItemLayout$$ExternalSyntheticLambda1(activityItemLayout, 7));
                int dip = activityItemLayout.getDip(0);
                Iterator it = map.sequence.iterator();
                while (it.hasNext()) {
                    dip = Math.max(dip, ((YInt) map.transformer.invoke(it.next())).value);
                }
                TransformingSequence map2 = SequencesKt___SequencesKt.map(activityItemLayout.subtitle, new ActivityItemLayout$$ExternalSyntheticLambda1(activityItemLayout, 8));
                int dip2 = activityItemLayout.getDip(0);
                Iterator it2 = map2.sequence.iterator();
                while (it2.hasNext()) {
                    dip2 = Math.max(dip2, ((YInt) map2.transformer.invoke(it2.next())).value);
                }
                return new YInt(Math.max(activityItemLayout.getDip(88), dip + dip2 + activityItemLayout.marginTop + activityItemLayout.marginBottom));
            case 1:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top + activityItemLayout.marginTop);
            case 2:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left + activityItemLayout.marginLeft);
            case 3:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(activityItemLayout.m3565titleSubtitleLeftTENr5nQ());
            case 4:
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                layoutSpec.getClass();
                return new YInt(layoutSpec.getParent().m4372bottomh0YXg9w() - activityItemLayout.marginBottom);
            case 5:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(activityItemLayout.m3565titleSubtitleLeftTENr5nQ());
            case 6:
                ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                layoutSpec2.getClass();
                TransformingSequence map3 = SequencesKt___SequencesKt.map(activityItemLayout.subtitle, new ActivityItemLayout$$ExternalSyntheticLambda1(activityItemLayout, 11));
                int m4372bottomh0YXg9w = layoutSpec2.getParent().m4372bottomh0YXg9w() - activityItemLayout.marginBottom;
                Iterator it3 = map3.sequence.iterator();
                while (it3.hasNext()) {
                    m4372bottomh0YXg9w = Math.min(m4372bottomh0YXg9w, ((YInt) map3.transformer.invoke(it3.next())).value);
                }
                return new YInt(((layoutSpec2.getParent().padding().top + activityItemLayout.marginTop) + m4372bottomh0YXg9w) / 2);
            case 7:
                View view = (View) obj;
                view.getClass();
                return new YInt(activityItemLayout.getDip(1) + activityItemLayout.m3815heightdBGyhoQ(view));
            case 8:
                View view2 = (View) obj;
                view2.getClass();
                return new YInt(activityItemLayout.getDip(1) + activityItemLayout.m3815heightdBGyhoQ(view2));
            case 9:
                View view3 = (View) obj;
                view3.getClass();
                return new XInt(activityItemLayout.getDip(16) + activityItemLayout.m3818rightTENr5nQ(view3));
            case 10:
                View view4 = (View) obj;
                view4.getClass();
                return new XInt(activityItemLayout.m3816leftTENr5nQ(view4) - activityItemLayout.getDip(16));
            case 11:
                View view5 = (View) obj;
                view5.getClass();
                return new YInt(activityItemLayout.m3819topdBGyhoQ(view5) - activityItemLayout.getDip(1));
            case 12:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - activityItemLayout.marginRight);
            case 13:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - activityItemLayout.marginRight);
            case 14:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - activityItemLayout.buttonMarginRight);
            case 15:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top + activityItemLayout.marginTop);
            default:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - activityItemLayout.marginRight);
        }
    }
}
