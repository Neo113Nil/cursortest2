package com.knotapi.knot.models;

/* loaded from: classes4.dex */
public class ErrorView {
    String bg;
    String color;
    String content;
    String displayedAt;
    String logoLink;
    String name;
    String title;

    public ErrorView(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.name = str;
        this.title = str2;
        this.content = str3;
        this.logoLink = str4;
        this.bg = str5;
        this.color = str6;
        this.displayedAt = str7;
    }

    public String getContent() {
        return this.content;
    }

    public String getDisplayedAt() {
        return this.displayedAt;
    }

    public String getLogoLink() {
        return this.logoLink;
    }

    public String getName() {
        return this.name;
    }

    public String getThemeBackground() {
        return this.bg;
    }

    public String getThemeTextColor() {
        return this.color;
    }

    public String getTitle() {
        return this.title;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setDisplayedAt(String str) {
        this.displayedAt = str;
    }

    public void setLogoLink(String str) {
        this.logoLink = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setThemeBackground(String str) {
        this.bg = str;
    }

    public void setThemeTextColor(String str) {
        this.color = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
