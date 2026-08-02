package ru.CryptoPro.JCP.ControlPane;

import javax.swing.JPanel;

/* loaded from: classes4.dex */
public interface PageInterface {
    boolean apply();

    JPanel getPage();

    boolean isModified();

    void setMaster(MainControlPane mainControlPane);
}
