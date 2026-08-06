package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class a4 {
    public final android.view.View JhCgjQRTAOCT;
    public final defpackage.b4 ZpBGe2uQfcn8;
    public final defpackage.y3 fWTAfUmVKrZq;
    public final defpackage.y3 giKS3J6vZuNy;

    public a4(defpackage.b4 b4Var, defpackage.y3 y3Var, defpackage.y3 y3Var2, android.view.View view) {
        this.ZpBGe2uQfcn8 = b4Var;
        this.giKS3J6vZuNy = y3Var;
        this.fWTAfUmVKrZq = y3Var2;
        this.JhCgjQRTAOCT = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e9, code lost:
    
        if (r7 != false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean ZpBGe2uQfcn8(android.view.Menu menu) {
        int i;
        java.util.List actions;
        java.lang.CharSequence title;
        android.graphics.drawable.Icon icon;
        boolean shouldShowIcon;
        java.lang.CharSequence label;
        android.graphics.drawable.Drawable icon2;
        defpackage.ak1 ak1Var = (defpackage.ak1) this.giKS3J6vZuNy.ZpBGe2uQfcn8();
        final int i2 = 0;
        if (defpackage.ma0.QiMR8OkAhezm(ak1Var, null)) {
            return false;
        }
        menu.clear();
        java.util.List list = ak1Var.ZpBGe2uQfcn8;
        int size = list.size();
        final int i3 = 1;
        int i4 = 0;
        int i5 = 1;
        int i6 = 1;
        while (i4 < size) {
            defpackage.zj1 zj1Var = (defpackage.zj1) list.get(i4);
            if (zj1Var instanceof defpackage.hk1) {
                i = i5 + 1;
                java.lang.Object obj = zj1Var.ZpBGe2uQfcn8;
                final defpackage.hk1 hk1Var = (defpackage.hk1) zj1Var;
                android.view.MenuItem add = menu.add(i6, defpackage.ma0.QiMR8OkAhezm(obj, defpackage.ma0.lXYSMswtzmix) ? android.R.id.cut : defpackage.ma0.QiMR8OkAhezm(obj, defpackage.ma0.ULjnV488Y6RO) ? android.R.id.copy : defpackage.ma0.QiMR8OkAhezm(obj, defpackage.ma0.S0YpfprlOYIn) ? android.R.id.paste : defpackage.ma0.QiMR8OkAhezm(obj, defpackage.ma0.eSwlWMUpitz8) ? android.R.id.selectAll : defpackage.ma0.QiMR8OkAhezm(obj, defpackage.ma0.mnkwqFSfsWTC) ? android.R.id.autofill : i5, i5, hk1Var.giKS3J6vZuNy);
                add.setShowAsAction(2);
                add.setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() { // from class: z3
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                        java.lang.String text;
                        android.content.Intent intent;
                        android.app.ActivityOptions pendingIntentBackgroundActivityStartMode;
                        int i7 = i2;
                        java.lang.Object obj2 = this;
                        java.lang.Object obj3 = hk1Var;
                        switch (i7) {
                            case 0:
                                ((defpackage.hk1) obj3).JhCgjQRTAOCT.P05cfTpS5W5L(((defpackage.a4) obj2).ZpBGe2uQfcn8);
                                break;
                            default:
                                android.content.Context context = (android.content.Context) obj3;
                                android.view.textclassifier.TextClassification textClassification = (android.view.textclassifier.TextClassification) obj2;
                                text = textClassification.getText();
                                int hashCode = text != null ? text.hashCode() : 0;
                                intent = textClassification.getIntent();
                                android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, hashCode, intent, 201326592);
                                if (android.os.Build.VERSION.SDK_INT < 34) {
                                    activity.send();
                                    break;
                                } else {
                                    try {
                                        pendingIntentBackgroundActivityStartMode = android.app.ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                                        activity.send(pendingIntentBackgroundActivityStartMode.toBundle());
                                        break;
                                    } catch (android.app.PendingIntent.CanceledException e) {
                                        android.util.Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                                        break;
                                    }
                                }
                        }
                        return true;
                    }
                });
            } else {
                if (zj1Var instanceof defpackage.nk1) {
                    if (android.os.Build.VERSION.SDK_INT >= 28) {
                        i = i5 + 1;
                        final android.content.Context context = this.JhCgjQRTAOCT.getContext();
                        defpackage.nk1 nk1Var = (defpackage.nk1) zj1Var;
                        final android.view.textclassifier.TextClassification textClassification = nk1Var.giKS3J6vZuNy;
                        int i7 = nk1Var.fWTAfUmVKrZq;
                        if (i7 < 0) {
                            label = textClassification.getLabel();
                            android.view.MenuItem add2 = menu.add(android.R.id.textAssist, android.R.id.textAssist, i5, label);
                            add2.setShowAsAction(2);
                            icon2 = textClassification.getIcon();
                            add2.setIcon(icon2);
                            add2.setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() { // from class: z3
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                                    java.lang.String text;
                                    android.content.Intent intent;
                                    android.app.ActivityOptions pendingIntentBackgroundActivityStartMode;
                                    int i72 = i3;
                                    java.lang.Object obj2 = textClassification;
                                    java.lang.Object obj3 = context;
                                    switch (i72) {
                                        case 0:
                                            ((defpackage.hk1) obj3).JhCgjQRTAOCT.P05cfTpS5W5L(((defpackage.a4) obj2).ZpBGe2uQfcn8);
                                            break;
                                        default:
                                            android.content.Context context2 = (android.content.Context) obj3;
                                            android.view.textclassifier.TextClassification textClassification2 = (android.view.textclassifier.TextClassification) obj2;
                                            text = textClassification2.getText();
                                            int hashCode = text != null ? text.hashCode() : 0;
                                            intent = textClassification2.getIntent();
                                            android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context2, hashCode, intent, 201326592);
                                            if (android.os.Build.VERSION.SDK_INT < 34) {
                                                activity.send();
                                                break;
                                            } else {
                                                try {
                                                    pendingIntentBackgroundActivityStartMode = android.app.ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                                                    activity.send(pendingIntentBackgroundActivityStartMode.toBundle());
                                                    break;
                                                } catch (android.app.PendingIntent.CanceledException e) {
                                                    android.util.Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                                                    break;
                                                }
                                            }
                                    }
                                    return true;
                                }
                            });
                        } else {
                            int i8 = i7 == 0 ? 1 : i2;
                            actions = textClassification.getActions();
                            final android.app.RemoteAction JhCgjQRTAOCT = defpackage.jd.JhCgjQRTAOCT(actions.get(i7));
                            int i9 = i8 != 0 ? 16908353 : i2;
                            title = JhCgjQRTAOCT.getTitle();
                            android.view.MenuItem add3 = menu.add(android.R.id.textAssist, i9, i5, title);
                            add3.setShowAsAction(i8 == 0 ? 0 : 2);
                            if (i8 == 0) {
                                shouldShowIcon = JhCgjQRTAOCT.shouldShowIcon();
                            }
                            icon = JhCgjQRTAOCT.getIcon();
                            add3.setIcon(icon.loadDrawable(context));
                            add3.setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() { // from class: sn1
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                                    android.app.PendingIntent actionIntent;
                                    android.app.ActivityOptions pendingIntentBackgroundActivityStartMode;
                                    actionIntent = JhCgjQRTAOCT.getActionIntent();
                                    if (android.os.Build.VERSION.SDK_INT < 34) {
                                        actionIntent.send();
                                        return true;
                                    }
                                    try {
                                        pendingIntentBackgroundActivityStartMode = android.app.ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                                        actionIntent.send(pendingIntentBackgroundActivityStartMode.toBundle());
                                    } catch (android.app.PendingIntent.CanceledException e) {
                                        android.util.Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e);
                                    }
                                    return true;
                                }
                            });
                        }
                    }
                } else if (zj1Var instanceof defpackage.lk1) {
                    i6++;
                }
                i4++;
                i2 = 0;
            }
            i5 = i;
            i4++;
            i2 = 0;
        }
        return true;
    }
}
