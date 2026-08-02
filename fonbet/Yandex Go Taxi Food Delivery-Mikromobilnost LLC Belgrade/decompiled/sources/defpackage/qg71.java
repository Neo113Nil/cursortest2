package defpackage;

import org.xmlpull.v1.XmlPullParser;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import yads.fk1;

/* loaded from: classes7.dex */
public final class qg71 implements zc81 {
    public static na71 a(XmlPullParser xmlPullParser) {
        fk1 fk1Var;
        Integer l;
        Integer l2;
        Integer l3;
        xmlPullParser.require(2, null, "MediaFile");
        String attributeValue = xmlPullParser.getAttributeValue(null, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "type");
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "height");
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "width");
        String attributeValue5 = xmlPullParser.getAttributeValue(null, "bitrate");
        String attributeValue6 = xmlPullParser.getAttributeValue(null, "apiFramework");
        String attributeValue7 = xmlPullParser.getAttributeValue(null, "id");
        String attributeValue8 = xmlPullParser.getAttributeValue(null, "codec");
        String attributeValue9 = xmlPullParser.getAttributeValue(null, "vmaf");
        String a = xf81.a(xmlPullParser);
        fk1[] values = fk1.values();
        int length = values.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                fk1Var = null;
                break;
            }
            fk1Var = values[i2];
            if (jl40.l(fk1Var.b, attributeValue)) {
                break;
            }
            i2++;
        }
        int intValue = (attributeValue3 == null || (l3 = bvu0.l(10, attributeValue3)) == null) ? 0 : l3.intValue();
        int intValue2 = (attributeValue4 == null || (l2 = bvu0.l(10, attributeValue4)) == null) ? 0 : l2.intValue();
        if (attributeValue5 != null && (l = bvu0.l(10, attributeValue5)) != null) {
            i = l.intValue();
        }
        return new na71(a, attributeValue7, fk1Var, attributeValue2, attributeValue8, attributeValue9 != null ? avu0.j(attributeValue9) : null, intValue, intValue2, i, attributeValue6);
    }

    @Override // defpackage.zc81
    public final /* bridge */ /* synthetic */ Object f(XmlPullParser xmlPullParser, zy2 zy2Var) {
        return a(xmlPullParser);
    }
}
