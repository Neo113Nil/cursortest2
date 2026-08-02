package io.flutter.plugin.mouse;

import defpackage.eb30;
import io.flutter.embedding.android.FlutterView;
import java.util.HashMap;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes4.dex */
public final class a {
    public final /* synthetic */ eb30 a;

    public a(eb30 eb30Var) {
        this.a = eb30Var;
    }

    public final void a(String str) {
        final eb30 eb30Var = this.a;
        FlutterView flutterView = eb30Var.a;
        if (eb30.c == null) {
            eb30.c = new HashMap<String, Integer>() { // from class: io.flutter.plugin.mouse.MouseCursorPlugin$2
                private static final long serialVersionUID = 1;

                {
                    put("alias", 1010);
                    put("allScroll", 1013);
                    put("basic", 1000);
                    put("cell", 1006);
                    put("click", 1002);
                    put("contextMenu", 1001);
                    put("copy", 1011);
                    put("forbidden", 1012);
                    put("grab", 1020);
                    put("grabbing", 1021);
                    put("help", 1003);
                    put("move", 1013);
                    put("none", 0);
                    put("noDrop", 1012);
                    put("precise", 1007);
                    put("text", Integer.valueOf(Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND));
                    put("resizeColumn", 1014);
                    put("resizeDown", 1015);
                    put("resizeUpLeft", 1016);
                    put("resizeDownRight", 1017);
                    put("resizeLeft", 1014);
                    put("resizeLeftRight", 1014);
                    put("resizeRight", 1014);
                    put("resizeRow", 1015);
                    put("resizeUp", 1015);
                    put("resizeUpDown", 1015);
                    put("resizeUpLeft", 1017);
                    put("resizeUpRight", 1016);
                    put("resizeUpLeftDownRight", 1017);
                    put("resizeUpRightDownLeft", 1016);
                    put("verticalText", Integer.valueOf(Constants.RESULT_CHECK_ERROR_CARRIER_NOT_FOUND));
                    put("wait", 1004);
                    put("zoomIn", 1018);
                    put("zoomOut", 1019);
                }
            };
        }
        flutterView.setPointerIcon(flutterView.getSystemPointerIcon(((Integer) eb30.c.getOrDefault(str, 1000)).intValue()));
    }
}
